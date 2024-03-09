package SymbolTable;

import Nodes.*;
import Nodes.StmtNodes.DeclarationNodes.VariableDeclarationNode;

import java.util.Hashtable;

public class SymbolTable {
    private Hashtable<String, SymbolTableEntry> _hashTable;

    public void EnterSymbol(SymbolTableEntry entry) {
        _hashTable.put(entry.getName(), entry);
    }

    public boolean ContainsSymbol(String id) {
        return _hashTable.containsKey(id);
    }

    public SymbolTableEntry RetrieveSymbol(String id) {
        return _hashTable.get(id);
    }

    public SymbolTable() {
        _hashTable = new Hashtable<String, SymbolTableEntry>();
    }

    public boolean SymbolIsDeclared(String id) {
        if (this.RetrieveSymbol(id) == null) return false;
        else return true;
    }

    public boolean SymbolIsInitialized(String id) {
        if (!SymbolIsDeclared(id)) return false;
        else if (this.RetrieveSymbol(id).isInitialized()) return true;
        else return false;
    }

    public void MarkSymbolAsInitialized(String id) {
        if (this.RetrieveSymbol(id).isInitialized()) return;
        else {
            SymbolTableEntry entryToMark = this.RetrieveSymbol(id);
            entryToMark.MarkAsInitialized();
            this.EnterSymbol(entryToMark);
        }
    }
}
