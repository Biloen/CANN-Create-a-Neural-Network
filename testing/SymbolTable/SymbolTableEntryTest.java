package SymbolTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SymbolTableEntryTest {
    @Test
    public void getNameGetsEntryName(){
        int[] dimensions = new int[] {1,2};
        SymbolTableEntry e = new SymbolTableEntry("name", "mtrx", "int", dimensions);
        assertEquals("name", e.getName());
    }
    @Test
    public void getTypeGetsEntryType(){
        int[] dimensions = new int[] {1,2};
        SymbolTableEntry e = new SymbolTableEntry("name", "mtrx", "int", dimensions);
        assertEquals("mtrx", e.getType());
    }
    @Test
    public void getSubtypeGetsEntrySubtype(){
        int[] dimensions = new int[] {1,2};
        SymbolTableEntry e = new SymbolTableEntry("name", "mtrx", "int", dimensions);
        assertEquals("int", e.getSubType());
    }
    @Test
    public void getDimensionsGetsEntryDimensions(){
        int[] dimensions = new int[] {1,2};
        SymbolTableEntry e = new SymbolTableEntry("name", "mtrx", "int", dimensions);
        assertEquals(dimensions, e.getDimensions());
    }
    @Test
    public void MarkAsInitializedMarksUninitializedEntry() {
        SymbolTableEntry e = new SymbolTableEntry("name", "int", false);
        e.MarkAsInitialized();
        assertTrue(e.isInitialized());
    }
    @Test
    public void isInitializedReturnsTrueIfInitialized() {
        SymbolTableEntry e = new SymbolTableEntry("name", "int", true);
        assertTrue(e.isInitialized());
    }
    @Test
    public void isInitializedReturnsFalseIfNotInitialized() {
        SymbolTableEntry e = new SymbolTableEntry("name", "int", false);
        assertFalse(e.isInitialized());
    }
    @Test
    public void getLengthReturns3ForVectorOfLength3() {
        SymbolTableEntry e = new SymbolTableEntry("name", "vec", "int", 3);
        assertEquals(3, e.getLength());
    }


}
