package ASTVisitors;

import Errors.IError;
import Errors.IdentifierNotDeclaredError;
import Errors.IdentifierUsedBeforeInitializationError;
import Exceptions.UndeclaredVariableException;
import Nodes.BaseNode;
import Nodes.NnDimensions;
import Nodes.StmtNodes.AssignmentNode;
import Nodes.StmtNodes.ControlStructureNodes.IfNode;
import Nodes.StmtNodes.ControlStructureNodes.LoopNode;
import Nodes.StmtNodes.ControlStructureNodes.WhileNode;
import Nodes.StmtNodes.DeclarationNodes.*;
import Nodes.StmtNodes.ExpressionNodes.ArithmeticExpressionNodes.*;
import Nodes.StmtNodes.ExpressionNodes.BooleanExpressionNodes.*;
import Nodes.StmtNodes.ExpressionNodes.VectorExpressionNodes.*;
import Nodes.StmtNodes.FuncCallNodes.ExportNode;
import Nodes.StmtNodes.FuncCallNodes.ImportNode;
import Nodes.StmtNodes.FuncCallNodes.TestNode;
import Nodes.StmtNodes.FuncCallNodes.TrainNode;
import Nodes.StmtNodes.HelperNodes.MatrixValueNode;
import Nodes.TopNode;
import Nodes.TypeNode;
import Nodes.ValueNodes.IdentifierNode;
import Nodes.ValueNodes.MathFunctionNodes.DimensionNode;
import Nodes.ValueNodes.NumberNodes.IntegerNumeralNode;
import Nodes.ValueNodes.NumberNodes.NaturalNumeralNode;
import Nodes.ValueNodes.NumberNodes.RealNumeralNode;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTableEntry;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class SymbolTableVisitor extends BaseVisitor{

    private SymbolTable _table;
    private ArrayList<IError> _internalErrorList;

    public SymbolTableVisitor(SymbolTable table) {
        this._table = table;
        this._internalErrorList = new ArrayList<IError>();
    }

    public ArrayList<IError> GetErrors() {
        return _internalErrorList;
    }

    @Override
    public void visit(TopNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(IfNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(WhileNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(LoopNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }


    @Override
    public void visit(MatrixDeclarationNode node) { // right side can contain bad id, check that it does not declare/initialize left side
        TypeNode           innerTypeNode = (TypeNode) node.children.get(0);
        IntegerNumeralNode dim1Node = (IntegerNumeralNode) node.children.get(1);
        IntegerNumeralNode dim2Node = (IntegerNumeralNode) node.children.get(2);
        IdentifierNode     idNode = (IdentifierNode) node.children.get(3);

        String name = idNode.identifier;
        String type = "mtrx";
        String innerType = innerTypeNode.identifier;
        int[] dimensions = {dim1Node.value, dim2Node.value};

        if (node.children.size() == 4) { // no right side
            _table.EnterSymbol(new SymbolTableEntry(name,type,innerType,dimensions));
        } else if (node.children.size() == 5) { // right side
            BaseNode rightSide = (BaseNode) node.children.get(4);
            int errorListLengthBeforeRightSide = _internalErrorList.size();
            rightSide.Accept(this);
            if (errorListLengthBeforeRightSide < _internalErrorList.size()) {
                return;
            } else {
                _table.EnterSymbol(new SymbolTableEntry(name,type,innerType,dimensions));
                _table.MarkSymbolAsInitialized(name);
            }
        }
    }

    @Override
    public void visit(NNDeclarationNode node) {
        TypeNode typeNode = (TypeNode)node.children.get(0);
        IdentifierNode idNode = (IdentifierNode)node.children.get(1);

        // Declaration by dimensions
        if (node.children.get(2) instanceof NnDimensions) {
            NnDimensions nndimNode = (NnDimensions) node.children.get(2);
            int dimensions = nndimNode.children.size();
            // Array for dimensions of nn
            int[] dimensionArray = new int[dimensions];
            for (int i = 0; i < dimensions; i++) {
                IntegerNumeralNode tempNode = (IntegerNumeralNode) nndimNode.children.get(i);
                dimensionArray[i] = tempNode.value;
            }
            _table.EnterSymbol(new SymbolTableEntry(idNode.identifier, typeNode.identifier, dimensionArray));
            _table.MarkSymbolAsInitialized(idNode.identifier);
        // Declaration by import
        } else if (node.children.get(2) instanceof ImportNode) {
            _table.EnterSymbol(new SymbolTableEntry(idNode.identifier, typeNode.identifier));
            _table.MarkSymbolAsInitialized(idNode.identifier);
        }
    }

    @Override
    public void visit(VariableDeclarationNode node) { // oh yeah right side can be null, len 2
        TypeNode type = (TypeNode) node.children.get(0);
        IdentifierNode id = (IdentifierNode) node.children.get(1);
        if (node.children.size() == 2) {
            _table.EnterSymbol(new SymbolTableEntry(id.identifier, type.identifier));
        } else if(node.children.size() == 3) {
            BaseNode rightSide = (BaseNode) node.children.get(2);
            rightSide.Accept(this);
            if (rightSide instanceof IdentifierNode && _table.SymbolIsInitialized(((IdentifierNode) rightSide).identifier)) {
                _table.EnterSymbol(new SymbolTableEntry(id.identifier, type.identifier));
                _table.MarkSymbolAsInitialized(id.identifier);
            } else if(!(rightSide instanceof IdentifierNode)) {
                _table.EnterSymbol(new SymbolTableEntry(id.identifier, type.identifier));
                _table.MarkSymbolAsInitialized(id.identifier);
            }
        }
    }

    @Override
    public void visit(VectorDeclarationNode node) { // can have 3 or 4 children.
        String type = "vec";
        TypeNode innerType = (TypeNode) node.children.get(0);
        IntegerNumeralNode length = (IntegerNumeralNode) node.children.get(1);
        IdentifierNode id = (IdentifierNode) node.children.get(2);

        if (node.children.size() == 3) { // declaration
            _table.EnterSymbol(new SymbolTableEntry(id.identifier, type, innerType.identifier, length.value));
        } else if (node.children.size() == 4) { // initialization
            BaseNode rightSide = (BaseNode) node.children.get(3);
            int errorListLengthBeforeRightSide = _internalErrorList.size();
            rightSide.Accept(this); // her bliver fejl for resten fanget :D
            if (errorListLengthBeforeRightSide < _internalErrorList.size()) {
                return;
            } else {
                _table.EnterSymbol(new SymbolTableEntry(id.identifier, type, innerType.identifier, length.value));
                _table.MarkSymbolAsInitialized(id.identifier);
            }
            // IDÉ! felj-listen gror hvis der er fejl i højresiden!
        }
    }

    @Override
    public void visit(IdentifierNode node) {
        System.out.println("visiting id node " +node.identifier);
        if (!_table.SymbolIsDeclared(node.identifier)){ // is declared?
            IdentifierNotDeclaredError declError = new IdentifierNotDeclaredError(node.identifier);
            _internalErrorList.add(declError);
        } else if(!_table.SymbolIsInitialized(node.identifier)){ // is initialized?
            IdentifierUsedBeforeInitializationError initError = new IdentifierUsedBeforeInitializationError(node.identifier);
            _internalErrorList.add(initError);
        }
    }

    @Override
    public void visit(ArithmeticDivOperationNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(ArithmeticMinusOperationNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(ArithmeticPlusOperationNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(ArithmeticTimesOperationNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(ArithmeticUnaryExprNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(ParenthesizedNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(BooleanValueNode node) {

    }

    @Override
    public void visit(CompareExpressionNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(LogicalExpressionNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(NegatedBooleanExpression node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(HadaVectorExpressionNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(MinusVectorExpressionNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(MultiplicationVectorExpressionNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(ParenthesizedVectorExpressionNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(PlusVectorExpressionNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(VectorValueNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(VectorValueNode node, int vectorLength) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(VectorValueNode node, SymbolTableEntry matrixDclEntry) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(ExportNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(ImportNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(TestNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(TrainNode node) {
        System.out.println(node.children);
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(MatrixValueNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(MatrixValueNode node, SymbolTableEntry matrixDclEntry) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(AssignmentNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(NnDimensions node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(NnDimensions node, SymbolTableEntry nnDclEntry) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(TypeNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }

    @Override
    public void visit(IntegerNumeralNode node) {
    }


    @Override
    public void visit(RealNumeralNode node) {
    }

    @Override
    public void visit(DataDeclarationNode node) {
        // must initialize its two children, but FIRST see if they are actually declared
        String idOfFirstParameter = ((IdentifierNode) node.children.get(0)).identifier;
        String idOfSecondParameter = ((IdentifierNode) node.children.get(1)).identifier;
        // first parameter
        if (_table.SymbolIsDeclared(idOfFirstParameter)) _table.MarkSymbolAsInitialized(idOfFirstParameter);
        else _internalErrorList.add(new IdentifierNotDeclaredError(idOfFirstParameter));
        // second parameter
        if (_table.SymbolIsDeclared(idOfSecondParameter)) _table.MarkSymbolAsInitialized(idOfSecondParameter);
        else _internalErrorList.add(new IdentifierNotDeclaredError(idOfSecondParameter));
    }

    @Override
    public void visit(GreaterThanNode node) {
        for (BaseNode n: node.children) {
            n.Accept(this);
        }
    }
}
