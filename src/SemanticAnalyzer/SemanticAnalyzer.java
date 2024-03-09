package SemanticAnalyzer;

import ASTVisitors.SemanticVisitors;
import ASTVisitors.SymbolTableVisitor;
import Errors.IError;
import Nodes.BaseNode;
import SymbolTable.SymbolTable;

import java.util.ArrayList;

public class SemanticAnalyzer {
    private ArrayList<IError> _errorList;
    private SymbolTableVisitor _symbolTableVisitor;
    private SymbolTable _symbolTable;
    private SemanticVisitors _semanticVisitors;
    // todo add 1 other
    private BaseNode _asTree;

    public SemanticAnalyzer(BaseNode asTree) {
        this._symbolTable = new SymbolTable();
        this._symbolTableVisitor = new SymbolTableVisitor(this._symbolTable);
        this._semanticVisitors = new SemanticVisitors(this._symbolTable);
        this._errorList = new ArrayList<IError>();
        this._asTree = asTree;
    }

    public void Analyze() {
        _asTree.Accept(_symbolTableVisitor);
        _errorList.addAll(_symbolTableVisitor.GetErrors());
        _asTree.Accept(_semanticVisitors);
        _errorList.addAll(_semanticVisitors.GetErrors());
        // todo accept typecheckvisitor and add its errors to the errorlist
    }

    public void HandleErrors() {
        if (!_errorList.isEmpty()) {
            PrintErrors();
            System.exit(0); // todo this is not so elegant :DDDDDDD
        }
    }

    private void PrintErrors() {
        for (IError error: _errorList) {
            error.PrintError();
        }
    }



}
