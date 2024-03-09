package SymbolTable;

import ASTGenerator.ASTGenerator;
import Nodes.BaseNode;
import gen.CANNLexer;
import gen.CANNParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SymbolTableTest {

    @Test
    public void ContainsSymbolReturnsFalseForNotContainedEntry() {
        SymbolTable t = new SymbolTable();
        String key = "thisKeyIsNeverEntered";
        assertFalse(t.ContainsSymbol(key));
    }

    @Test
    public void ContainsSymbolReturnsTrueForContainedEntry() {
        SymbolTable t = new SymbolTable();
        String key = "iWillBeEntered";
        t.EnterSymbol(new SymbolTableEntry(key, "int"));
        assertTrue(t.ContainsSymbol(key));
    }

    @Test
    public void EnterSymbolEntersVarDecl(){
        SymbolTable t = new SymbolTable();
        String key = "someId";
        SymbolTableEntry e = new SymbolTableEntry(key, "int");
        t.EnterSymbol(e);
        assertTrue(t.ContainsSymbol(key));
    }
    @Test
    public void RetrieveSymbolRetrievesEntry() {
        SymbolTable t = new SymbolTable();
        String key = "someId";
        SymbolTableEntry e = new SymbolTableEntry(key, "int");
        t.EnterSymbol(e);
        SymbolTableEntry eRetrieved = t.RetrieveSymbol(key);
        assertSame(e, eRetrieved);
    }

    @Test
    public void SymbolIsDeclaredReturnsTrueForDeclaredSymbol() {
        SymbolTable t = new SymbolTable();
        String key = "someId";
        SymbolTableEntry e = new SymbolTableEntry(key, "int");
        t.EnterSymbol(e);
        assertTrue(t.SymbolIsDeclared(key));
    }
    @Test
    public void SymbolIsDeclaredReturnsFalseForUndeclaredSymbol() {
        SymbolTable t = new SymbolTable();
        String key = "someId";
        assertFalse(t.SymbolIsDeclared(key));
    }
    @Test
    public void SymbolIsInitializedReturnsTrueForInitializedSymbol() {
        SymbolTable t = new SymbolTable();
        String key = "someId";
        SymbolTableEntry e = new SymbolTableEntry(key, "int", true);
        t.EnterSymbol(e);
        assertTrue(t.SymbolIsInitialized(key));
    }
    @Test
    public void SymbolIsInitializedReturnsFalseForUnitializedSymbol() {
        SymbolTable t = new SymbolTable();
        String key = "someId";
        SymbolTableEntry e = new SymbolTableEntry(key, "int", false);
        t.EnterSymbol(e);
        assertFalse(t.SymbolIsInitialized(key));
    }
    @Test
    public void MarkSymbolAsInitializedMarksUninitializedSymbol() {
        SymbolTable t = new SymbolTable();
        String key = "someId";
        SymbolTableEntry e = new SymbolTableEntry(key, "int", false);
        t.EnterSymbol(e);
        t.MarkSymbolAsInitialized(key);
        assertTrue(t.SymbolIsInitialized(key));
    }
}
