package ASTVisitors;

import Errors.*;
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
import Nodes.ValueNodes.NumberNodes.IntegerNumeralNode;
import Nodes.ValueNodes.NumberNodes.RealNumeralNode;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTableEntry;

import javax.sound.midi.SysexMessage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class SemanticVisitors extends BaseVisitor {

    private SymbolTable ST;
    private ArrayList<IError> _localErrorList;

    public int vec1;
    public int integerNumeralForVisitor;
    public double realNumeralForVisitor;

    public SemanticVisitors(SymbolTable symbolTable) {
        this.ST = symbolTable;
        this._localErrorList = new ArrayList<IError>();
    }

    public ArrayList<IError> GetErrors() {
        return _localErrorList;
    }

    @Override
    public void visit(TopNode node) {
        if (node.children.size() < 1) {
            ProgramEmptyError error = new ProgramEmptyError("");
            _localErrorList.add(error);
        }

        for (BaseNode n: node.children) {
            n.Accept(this);
            VectorList.clear();
        }
    }

    @Override
    public void visit(IfNode node) {
        visitBooleans(node.children.get(0));

/*        BooleanValueNode nodeCondition = (BooleanValueNode) node.children.get(0);

        if (!nodeCondition._value) {
            IllegalCtrlBooleanError error = new IllegalCtrlBooleanError("if");
            _localErrorList.add(error);
        }
*/
        node.children.get(1).Accept(this);
    }

    @Override
    public void visit(WhileNode node) {

        visitBooleans(node.children.get(0));
//        BooleanValueNode nodeCondition = (BooleanValueNode) node.children.get(0);
  //      if (!nodeCondition._value) {
  //          IllegalCtrlBooleanError error = new IllegalCtrlBooleanError("while");
  //          _localErrorList.add(error);
   //     }
        node.children.get(1).Accept(this);
    }

    @Override
    public void visit(LoopNode node) {

        int tmp=0;
        for(int i =0; i< node.children.size(); i++)
        {
            String nameChild = node.children.get(i).getClass().getSimpleName();

            if (i == 0) {
                switchCase(nameChild, node, i);
                tmp = integerNumeralForVisitor;
            }

            if(i == 1) {
                switchCase(nameChild, node, i);
            }

            if (tmp > integerNumeralForVisitor) {
                LoopParameterError error = new LoopParameterError("");
                _localErrorList.add(error);
            }
        }
    }

    @Override
    public void visit(MatrixDeclarationNode node) {

        IdentifierNode nodeId = (IdentifierNode) (node.children.get(3));

        SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);

        String nodeType = nodeEntry.getType();

        int[] dimensions = nodeEntry.getDimensions();

        int dimensionOne = dimensions[0];

        int dimensionTwo = dimensions[1];

        visit(node.children.get(1));

        visit(node.children.get(2));

        if (dimensionOne < 1 || dimensionTwo < 1){
            DimensionError error = new DimensionError("Dimensions cannot be zero or negative.");
            _localErrorList.add(error);
        }

        if (node.children.size() == 5) {
            visit((MatrixValueNode) node.children.get(4), nodeEntry);
        }
    }

    @Override
    public void visit(NNDeclarationNode node) {
        TypeNode typeOfNode = (TypeNode) node.children.get(0);

        String typeOfNodeString = typeOfNode.identifier;

        IdentifierNode nodeId = (IdentifierNode) node.children.get(1);
        SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);

        if (node.children.get(2).getClass().toString().contains("Import"))
        {
            node.children.get(2).Accept(this);
        }
        else
        {
            visit((NnDimensions) node.children.get(2), nodeEntry);
        }
    }

    @Override
    public void visit(VariableDeclarationNode node) {
        IdentifierNode nodeId = (IdentifierNode) node.children.get(1);

        SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);

        node.children.get(0).Accept(this);

        if (node.children.size() == 3) {

            node.children.get(2).Accept(this);
        }
    }

    @Override
    public void visit(VectorDeclarationNode node) {

        IdentifierNode nodeId = (IdentifierNode) (node.children.get(2));

        SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);

        String nodeType = nodeEntry.getSubType();

        int vectorDclLength = nodeEntry.getLength();
        // if there is a vector literal right side
        if (node.children.size() == 4 && node.children.get(3) instanceof VectorValueNode) {
            visit((VectorValueNode) node.children.get(3), vectorDclLength);
        // if right side is id
        } else if (node.children.get(3) instanceof IdentifierNode) {
            node.children.get(3).Accept(this);
        }
    }

    ArrayList<Integer> VectorList = new ArrayList<>();
    @Override
    public void visit(IdentifierNode node) {
        //SymbolTableEntry nodeEntry = ST.RetrieveSymbol(node.identifier);
        //VectorList.add(nodeEntry.getLength());

    }

    private void switchCase(String s, BaseNode node, int i) {
        switch (s) {
            case "ArithmeticDivOperationNode":
                visit((ArithmeticDivOperationNode) node.children.get(i));
                break;
            case "ArithmeticMinusOperationNode":
                visit((ArithmeticMinusOperationNode) node.children.get(i));
                break;
            case "ArithmeticPlusOperationNode":
                visit((ArithmeticPlusOperationNode) node.children.get(i));
                break;
            case "ArithmeticTimesOperationNode":
                visit((ArithmeticTimesOperationNode) node.children.get(i));
                break;
            case "ArithmeticUnaryExprNode":
                visit((ArithmeticUnaryExprNode) node.children.get(i));
                break;
            case "ParenthesizedNode":
                visit((ParenthesizedNode) node.children.get(i));
                break;
            case "IntegerNumeralNode":
                 visit((IntegerNumeralNode) node.children.get(i));
                 break;

                 case "RealNumeralNode":
                    visit((RealNumeralNode) node.children.get(i));
                break;

            default:
                ArithExprError error = new ArithExprError("Something is wrong with Arithmetic Expressions");
                _localErrorList.add(error);
        }
    }

    @Override
    public void visit(ArithmeticDivOperationNode node) {
        if (node.children.size() == 0) {
            EmptyNodeError error = new EmptyNodeError("");
            _localErrorList.add(error);
        }

        if (node.children.get(0).getClass().getSimpleName().contains("Operation"))
        {
            visit(node.children.get(0));
        }
        else {
            if (node.children.get(0).getClass().getSimpleName().contains("Identifier")) {

                IdentifierNode nodeId = (IdentifierNode) node.children.get(0);
                SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);
                if (Objects.equals(nodeEntry.getType(), "vec")) {
                    VectorExpressionError error = new VectorExpressionError("Division for vectors illegal");
                    _localErrorList.add(error);
                }
            }
        }
        if (node.children.get(1).getClass().getSimpleName().contains("Identifier")) {
            IdentifierNode nodeId = (IdentifierNode) node.children.get(1);
            SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);

            if (Objects.equals(nodeEntry.getType(), "vec")) {

                VectorList.add(nodeEntry.getLength());
                for (int i = 0; i < VectorList.size(); i++) {
                    if (!Objects.equals(VectorList.get(0), VectorList.get(i))) {
                        VectorExpressionError error = new VectorExpressionError("vector is not same size");
                        _localErrorList.add(error);
                    }

                }
            }
        }
            else
            {
                if (node.children.get(1).getClass().getSimpleName().contains("Integer"))
                {
                    IntegerNumeralNode nodeNumber = (IntegerNumeralNode) node.children.get(1);
                    if (nodeNumber.value == 0)
                    {
                        ArithExprError error = new ArithExprError("Division by null");
                        _localErrorList.add(error);
                    }
                }
                else if (node.children.get(1).getClass().getSimpleName().contains("Real"))
                {
                    RealNumeralNode nodeNumber = (RealNumeralNode) node.children.get(1);
                    if (nodeNumber.value == 0)
                    {
                        ArithExprError error = new ArithExprError("Division by null");
                        _localErrorList.add(error);
                    }
                }

            }

            /*
        double value=2;
        int valueInt=2;


        for (int i = 0; i < node.children.size(); i++) {
            visit(node.children.get(i));
            String nameChild = node.children.get(i).getClass().getSimpleName();

            if(i == 1) {

                switchCase(nameChild, node, i);
                if(nameChild.contains("Integer")){
                    valueInt = integerNumeralForVisitor;

                }
                else{
                    value = realNumeralForVisitor;
                }
            }

            if (realNumeralForVisitor == 0 && integerNumeralForVisitor == 0){
                ArithExprError error = new ArithExprError("Trying to divide by 0, or something else went wrong when visiting.");
                _localErrorList.add(error);
            }
        }

 */
    }

    @Override
    public void visit(ArithmeticMinusOperationNode node) {
        ArrayList<Integer> tmpArray = new ArrayList<>();

        if (node.children.size() == 0) {
            EmptyNodeError error = new EmptyNodeError("");
            _localErrorList.add(error);
        }
            if (node.children.get(0).getClass().getSimpleName().contains("Operation"))
            {
                visit(node.children.get(0));
            }
            else {
                if (node.children.get(0).getClass().getSimpleName().contains("Identifier")) {
                    System.out.println(node.children.get(0).getClass().getSimpleName());
                    IdentifierNode nodeId = (IdentifierNode) node.children.get(0);
                    SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);

                    if (Objects.equals(nodeEntry.getType(), "vec")) {
                        VectorList.add(nodeEntry.getLength());
                    }
                }
            }
            if (node.children.get(1).getClass().getSimpleName().contains("Identifier")) {
                IdentifierNode nodeId = (IdentifierNode) node.children.get(1);
                SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);

                if (Objects.equals(nodeEntry.getType(), "vec")) {
                    if (VectorList.size() < 1)
                    {
                        ArithExprError erorr = new ArithExprError("vector operations with arithmetic expressions are illegal");
                        _localErrorList.add(erorr);
                    }
                    VectorList.add(nodeEntry.getLength());
                    for (int i = 0; i < VectorList.size(); i++) {
                        if (!Objects.equals(VectorList.get(0), VectorList.get(i))) {
                            VectorExpressionError error = new VectorExpressionError("vector is not same size");
                            _localErrorList.add(error);
                        }
                    }
                }
            }
            else {
                if (VectorList.size() > 0) {
                    ArithExprError erorr = new ArithExprError("vector operations with arithmetic expressions are illegal");
                    _localErrorList.add(erorr);
                }
            }
        /*if(node.children.get(i).getClass().getSimpleName().contains("Identifier")) {

                IdentifierNode nodeId = (IdentifierNode) node.children.get(i);
                SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);
                if (Objects.equals(nodeEntry.getType(), "vec"))
                {

                    VectorList.add(nodeEntry.getLength());

                    System.out.println(nodeEntry.getName() + " jdiosafjaodsi    " + nodeEntry.getLength());
                    if (!Objects.equals(VectorList.get(0), VectorList.get(i)))
                        {
                            VectorExpressionError error = new VectorExpressionError("vector is not same size");
                            _localErrorList.add(error);
                        }

                }

            }
        System.out.println(VectorList.size());
        visit(node.children.get(i));
        }
        */
    }

    @Override
    public void visit(ArithmeticPlusOperationNode node) {

        if (node.children.size() == 0) {
            EmptyNodeError error = new EmptyNodeError("");
            _localErrorList.add(error);
        }
        if (node.children.get(0).getClass().getSimpleName().contains("Operation"))
        {
            visit(node.children.get(0));
        }
        else {
            if (node.children.get(0).getClass().getSimpleName().contains("Identifier")) {
                System.out.println(node.children.get(0).getClass().getSimpleName());
                IdentifierNode nodeId = (IdentifierNode) node.children.get(0);
                SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);

                if (Objects.equals(nodeEntry.getType(), "vec")) {
                    VectorList.add(nodeEntry.getLength());
                }
            }
        }
        if (node.children.get(1).getClass().getSimpleName().contains("Identifier")) {
            IdentifierNode nodeId = (IdentifierNode) node.children.get(1);
            SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);

            if (Objects.equals(nodeEntry.getType(), "vec")) {
                if (VectorList.size() < 1)
                {
                    ArithExprError erorr = new ArithExprError("vector operations with arithmetic expressions are illegal");
                    _localErrorList.add(erorr);
                }
                VectorList.add(nodeEntry.getLength());
                for (int i = 0; i < VectorList.size(); i++) {
                    if (!Objects.equals(VectorList.get(0), VectorList.get(i))) {
                        VectorExpressionError error = new VectorExpressionError("vector is not same size");
                        _localErrorList.add(error);
                    }
                }
            }
        }
        else {
            if (VectorList.size() > 0) {
                ArithExprError erorr = new ArithExprError("vector operations with arithmetic expressions are illegal");
                _localErrorList.add(erorr);
            }
        }
    }

    @Override
    public void visit(ArithmeticTimesOperationNode node) {

        if (node.children.size() == 0) {
            EmptyNodeError error = new EmptyNodeError("");
            _localErrorList.add(error);
        }
        if (node.children.get(0).getClass().getSimpleName().contains("Operation"))
        {
            visit(node.children.get(0));
        }
        else {
            if (node.children.get(0).getClass().getSimpleName().contains("Identifier")) {
                System.out.println(node.children.get(0).getClass().getSimpleName());
                IdentifierNode nodeId = (IdentifierNode) node.children.get(0);
                SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);

                if (Objects.equals(nodeEntry.getType(), "vec")) {
                    VectorList.add(nodeEntry.getLength());
                }
            }
        }
        if (node.children.get(1).getClass().getSimpleName().contains("Identifier")) {
            IdentifierNode nodeId = (IdentifierNode) node.children.get(1);
            SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);

            if (Objects.equals(nodeEntry.getType(), "vec")) {
                if (VectorList.size() < 1)
                {
                    ArithExprError erorr = new ArithExprError("vector operations with arithmetic expressions are illegal");
                    _localErrorList.add(erorr);
                }
                VectorList.add(nodeEntry.getLength());
                for (int i = 0; i < VectorList.size(); i++) {
                    if (!Objects.equals(VectorList.get(0), VectorList.get(i))) {
                        VectorExpressionError error = new VectorExpressionError("vector is not same size");
                        _localErrorList.add(error);
                    }
                }
            }
        }
        else {
            if (VectorList.size() > 0) {
                ArithExprError erorr = new ArithExprError("vector operations with arithmetic expressions are illegal");
                _localErrorList.add(erorr);
            }
        }
    }

    @Override
    public void visit(ArithmeticUnaryExprNode node) {
        if (node.children.size() == 0) {
            EmptyNodeError error = new EmptyNodeError("");
            _localErrorList.add(error);
        }
        for (int i = 0; i < node.children.size(); i++) {
            visit(node.children.get(i));
        }
    }

    @Override
    public void visit(ParenthesizedNode node) {
            if (node.children.size() == 0)
            {
                EmptyNodeError error = new EmptyNodeError("");
                _localErrorList.add(error);
            }
            visit(node.children.get(0));
    }


   public void visitBooleans(BaseNode node)
    {
        /*
        Visit boolean condition number 0 . That goes to boolean expression. Boolean Expression is achieved by
        going into a switch statement to find out what kind of node it is.
         */

//            String theNode = node.children.get(i).getClass().getSimpleName();
            String nodeType = node.getClass().getSimpleName();
            switch (nodeType) {
                case "CompareExpressionNode":

                    visit((CompareExpressionNode) node);
                    break;
                case "LogicalExpressionNode":
                    visit((LogicalExpressionNode) node);
                    break;
                case "NegatedBooleanExpression":
                    visit((NegatedBooleanExpression) node);
                    break;
                case "BooleanValueNode":
                    visit((BooleanValueNode) node);
                    break;
                default:
                    WrongBooleanError error = new WrongBooleanError("expression");
                    _localErrorList.add(error);
            }
        }

    @Override
    public void visit(BooleanValueNode node) {
        if (!(node._value == true || node._value == false)){
            String nodeName = String.format("%b", node._value);
            WrongBooleanError error = new WrongBooleanError(nodeName);
            _localErrorList.add(error);
        }
    }

    @Override
    public void visit(CompareExpressionNode node) {
        for (int i = 0 ; i < node.children.size(); i++)
        {
            node.children.get(i).Accept(this);
        }
    }

    @Override
    public void visit(LogicalExpressionNode node) {
        visit(node.children.get(0));
        visit(node.children.get(1));
    }

    @Override
    public void visit(NegatedBooleanExpression node) {

        for (int i = 0; i < node.children.size(); i++) {
            node.children.get(i).Accept(this);
        }
    }

    private int Vectors(String s, BaseNode node, int i) {
        switch (s) {
            case "HadaVectorExpressionNode":
                visit((HadaVectorExpressionNode) node.children.get(i));
                break;
            case "MinusVectorExpressionNode":
                visit((MinusVectorExpressionNode) node.children.get(i));
                break;
            case "PlusVectorExpressionNode":
                visit((PlusVectorExpressionNode) node.children.get(i));
                break;

            case "MultiplicationVectorExpressionNode":
                visit((MultiplicationVectorExpressionNode) node.children.get(i));
                break;
            case "ParenthesizedVectorExpressionNode":
                    visit((ParenthesizedNode) node.children.get(i));
                    break;
            case "VectorValueNode":
                return node.children.get(i).children.size();


            default:
                VectorExpressionError error = new VectorExpressionError("Something is wrong with Vector Expressions.");
                _localErrorList.add(error);
        }
        return vec1;
    }

    @Override
    public void visit(HadaVectorExpressionNode node) {
        vec1 = Vectors(node.children.get(0).getClass().getSimpleName(), node, 0);

        for(int i= 0; i < node.children.size(); i++){
            if (vec1 != Vectors(node.children.get(i).getClass().getSimpleName(), node, i))
            {
                VectorExpressionError error = new VectorExpressionError("Elements in HADA Vector are not the same length.");
                _localErrorList.add(error);
            }
        }
}

    @Override
    public void visit(MinusVectorExpressionNode node) {

        vec1 = Vectors(node.children.get(0).getClass().getSimpleName(), node, 0);

        for(int i= 0; i < node.children.size(); i++){

            if (vec1 != Vectors(node.children.get(i).getClass().getSimpleName(), node, i))
            {
                VectorExpressionError error = new VectorExpressionError("Elements in Minus Vector are not the same length.");
                _localErrorList.add(error);
            }
        }
    }

    @Override
    public void visit(MultiplicationVectorExpressionNode node) {
        for(int i=0; i < node.children.size(); i++)
        {
            node.children.get(i).Accept(this);
        }
    }

    @Override
    public void visit(ParenthesizedVectorExpressionNode node) {
        if (node.children.size() == 0)
        {
            VectorExpressionError error = new VectorExpressionError("There are no vectors inside of the parentheses.");
            _localErrorList.add(error);
        }
        node.children.get(0).Accept(this);
    }

    @Override
    public void visit(PlusVectorExpressionNode node) {
        for(int i = 0; i < node.children.size(); i++)
        {
            node.children.get(i).Accept(this);
        }
        /*
            ArrayList<Integer> plusIdentifierNodes = new ArrayList<Integer>();
        for (int i = 0; i < node.children.size(); i++) {

            if (node.children.get(i).getClass().getSimpleName().contains("Identifier")) {


                IdentifierNode nodeId = (IdentifierNode) node.children.get(i);

                SymbolTableEntry nodeEntry = ST.RetrieveSymbol(nodeId.identifier);
                int identifierLength = nodeEntry.getLength();
                plusIdentifierNodes.add(identifierLength);
                visit(node.children.get(i));
            }

            if (node.children.get(i).getClass().getSimpleName().contains("Identifier"))
            {
                for (int j =0; j < plusIdentifierNodes.size(); j++)
                {
                    if (plusIdentifierNodes.get(0) != plusIdentifierNodes.get(j))
                    {
                        VectorExpressionError error = new VectorExpressionError("Identifier lengths are not the same");
                        _localErrorList.add(error);
                    }
                }
            }
            else if (node.children.get(0).getClass().getSimpleName().contains("VectorValueNode")) {
                vec1 = Vectors(node.children.get(0).getClass().getSimpleName(), node, 0);


                    if (vec1 != Vectors(node.children.get(i).getClass().getSimpleName(), node, i)) {
                        VectorExpressionError error = new VectorExpressionError("Elements in plus vector are not the same length.");
                        _localErrorList.add(error);
                    }
                }

            else {
                visit((PlusVectorExpressionNode) node.children.get(i));
            }
        }
        */

    }
    @Override
    public void visit(VectorValueNode node) {
        if (node.children.get(0).getClass().getSimpleName().equals("IntegerNumeralNode")) {
            for (BaseNode child : node.children) {
                if (!(child instanceof IntegerNumeralNode)) {
                    TypeError error = new TypeError("The elements of the vector are not the same type.");
                    _localErrorList.add(error);
                }
            }
        }
        if (node.children.get(0).getClass().getSimpleName().equals("RealNumeralNode")) {
            for (BaseNode child : node.children) {
                if (!(child instanceof RealNumeralNode)) {
                    TypeError error = new TypeError("The elements of the vector are not the same type.");
                    _localErrorList.add(error);
                }
            }
        }
        for (int i = 0 ; i < node.children.size(); i++)
        {
            visit(node.children.get(i));
        }
    }


    @Override
    public void visit(VectorValueNode node, int vectorLength)
    {
        if (node.children.size() != vectorLength) {
            DimensionError error = new DimensionError("Vector declaration length not the same as in the value.");
            _localErrorList.add(error);
        }

        for (int i =0; i < node.children.size(); i++)
        {
            visit(node.children.get(i));
        }
    }

    @Override
    public void visit(VectorValueNode node, SymbolTableEntry matrixDclEntry) {

        int[] dimensions = matrixDclEntry.getDimensions();
        int firstDimension = dimensions[0];

        if (firstDimension != node.children.size())
        {
            DimensionError error = new DimensionError("A row in the matrix is not of length " + firstDimension);
            _localErrorList.add(error);
        }

        for (int i =0; i < node.children.size(); i++)
        {
            visit(node.children.get(i));
        }

    }

    @Override
    public void visit(ExportNode node) {
        IdentifierNode nodeId =  (IdentifierNode) node.children.get(0);
            if (nodeId.identifier == null){
                NoReferenceError error = new NoReferenceError("neural network");
                _localErrorList.add(error);
            }
    }

    @Override
    public void visit(ImportNode node) {

    }

    @Override
    public void visit(TestNode node) {
        IdentifierNode nodeId =  (IdentifierNode) node.children.get(0);
        if (nodeId.identifier == null){
            NoReferenceError error = new NoReferenceError("neural network");
            _localErrorList.add(error);
        }

        IdentifierNode nodeId2 = (IdentifierNode) node.children.get(1);
        if (nodeId2.identifier == null){
            NoReferenceError error = new NoReferenceError("input");
            _localErrorList.add(error);
        }

        IdentifierNode nodeId3 = (IdentifierNode) node.children.get(2);
        if (nodeId3.identifier == null){
            NoReferenceError error = new NoReferenceError("output");
            _localErrorList.add(error);
        }
    }

    @Override
    public void visit(TrainNode node) {

        IdentifierNode nodeId =  (IdentifierNode) node.children.get(0);
            if (nodeId.identifier == null){
                NoReferenceError error = new NoReferenceError("neural network");
                _localErrorList.add(error);
            }

            if (node.children.get(1).toString().contains("Integer"))
            {
                IntegerNumeralNode epochNumber = (IntegerNumeralNode) node.children.get(1);
                if (epochNumber.value < 1 ){
                    NegativeValueError error = new NegativeValueError("Epochs");
                    _localErrorList.add(error);
                }
            }

        if (node.children.get(2).toString().contains("Real"))
        {
            RealNumeralNode learningRate = (RealNumeralNode) node.children.get(2);
            if (learningRate.value < 0 ) {
                NegativeValueError error = new NegativeValueError("Learning rate");
                _localErrorList.add(error);
            }
        }

        node.children.get(2).Accept(this);

        IdentifierNode nodeId2 = (IdentifierNode) node.children.get(3);
        if (nodeId2.identifier == null){
            NoReferenceError error = new NoReferenceError("input");
            _localErrorList.add(error);
        }

        IdentifierNode nodeId3 = (IdentifierNode) node.children.get(4);
            if (nodeId3.identifier == null){
                NoReferenceError error = new NoReferenceError("output");
                _localErrorList.add(error);
            }

    }

    @Override
    public void visit(MatrixValueNode node){
        for (int i = 0; i < node.children.size(); i++) {
            visit((VectorValueNode) node.children.get(i));
        }
    }

    @Override
    public void visit (MatrixValueNode node, SymbolTableEntry matrixDclEntry)
    {
    int[] dimensions = matrixDclEntry.getDimensions();
    int secondDimension = dimensions[1];
    if (node.children.size() != secondDimension) {
        DimensionError error = new DimensionError("Number of vectors does not correspond to the matrix size. Expects " + secondDimension + ". Received " + node.children.size()+".");
        _localErrorList.add(error);
        }

        for (int i = 0 ; i < secondDimension; i++) {
            visit((VectorValueNode) node.children.get(i), matrixDclEntry);
        }
    }

    @Override
    public void visit(AssignmentNode node){
        if(node.children.get(1) instanceof VectorValueNode) {
            IdentifierNode leftSideId = (IdentifierNode) node.children.get(0);
            int rightSideLength = node.children.get(1).children.size();
            int leftSideLength = ST.RetrieveSymbol(leftSideId.identifier).getLength();
            if(rightSideLength != leftSideLength) {
                DimensionError error = new DimensionError("The length of the vector you are trying to assign does not match the definition of the identifier.");
                _localErrorList.add(error);
            }
        }
        if(node.children.get(1) instanceof MatrixValueNode) {
            MatrixValueNode rightSideNode = (MatrixValueNode) node.children.get(1);
            IdentifierNode leftSideId = (IdentifierNode) node.children.get(0);
            // get left dims
            int[] dims = ST.RetrieveSymbol(leftSideId.identifier).getDimensions();
            int leftDim1 = dims[0]; int leftDim2 = dims[1];
            // get right dims
            // get right side number of vectors
            int numberOfVectors = rightSideNode.children.size();
            // check if it matches left side
            if (leftDim1 != numberOfVectors) _localErrorList.add(new DimensionError("The number of rows in the right side of the assignment does not correspond to the number given on the left."));
            // check if all vectors match left side length
            for (BaseNode vvn : rightSideNode.children) {
                int numberOfVectorElements = vvn.children.size();
                if (leftDim2 != numberOfVectorElements) _localErrorList.add(new DimensionError("The number of elements on vector x does not correspond to the declared dimension y")); // we can say which one on right is wrong, and how many it has;expected.
            }
        }
        if (node.children.get(1) instanceof IdentifierNode) {
            SymbolTableEntry rightIdEntry = ST.RetrieveSymbol(((IdentifierNode) node.children.get(1)).identifier);
            SymbolTableEntry leftIdEntry = ST.RetrieveSymbol(((IdentifierNode) node.children.get(0)).identifier);
            String rightType = rightIdEntry.getType();
            String rightSubType = rightIdEntry.getSubType();

            if (rightType == "mtrx") { // check that both dims match
                int[] rightDims = rightIdEntry.getDimensions();
                int[] leftDims  = leftIdEntry.getDimensions();
                if (!Arrays.equals(rightDims,leftDims)) _localErrorList.add(new DimensionError("The dimensions of the matrices do not match."));
            } else if (rightType == "vec") {
                int rightLength = rightIdEntry.getLength();
                int leftLength  = leftIdEntry.getLength();
                if (rightLength != leftLength) _localErrorList.add(new DimensionError("The lengths of the vectors do not match."));
            }
        }
        node.children.get(1).Accept(this);
    }

    @Override
    public void visit(NnDimensions node){
        if (node.children.size() < 2) {
            LayerError error = new LayerError("The neural network cannot consist only of two layers.");
            _localErrorList.add(error);
        }

        for(BaseNode child : node.children)
        {
            visit(child);
            int currentDimension = integerNumeralForVisitor;
            if ( currentDimension< 0){
                LayerError error = new LayerError("The layers must be positive.");
                _localErrorList.add(error);
            }
        }
    }

    @Override
    public void visit(NnDimensions node, SymbolTableEntry nnDclEntry)
    {
        if (node.children.size() < 2) {
            LayerError error = new LayerError("The neural network cannot consist only of two layers");
            _localErrorList.add(error);
        }
        int[] dimensions = nnDclEntry.getDimensions();

        for (int i = 0; i < dimensions.length; i++)
        {
            IntegerNumeralNode currentNodeNum = (IntegerNumeralNode ) node.children.get(i);

            if (currentNodeNum.value < 1)
            {
                DimensionError error = new DimensionError("The dimensinos must be positive");
                _localErrorList.add(error);
            }
        }
    }

    @Override
    public void visit(TypeNode node){

    }

    @Override
    public void visit(IntegerNumeralNode node){
        if (!(Integer.class.isInstance(node.value))) {
            String nodeName = String.format("%d", node.value);
            NotAnIntegerError error = new NotAnIntegerError(nodeName);
            _localErrorList.add(error);
        }
        integerNumeralForVisitor = node.value;
    }

    @Override
    public void visit(RealNumeralNode node){
        if (!Double.class.isInstance(node.value)) {
            String nodeName = String.format("%f", node.value);
            NotAReal error = new NotAReal(nodeName);
            _localErrorList.add(error);
        }
        realNumeralForVisitor= node.value;
    }

    @Override
    public void visit(DataDeclarationNode node) {

    }

    @Override
    public void visit(GreaterThanNode node) {

    }
}