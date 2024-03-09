package SymbolTable;

public class SymbolTableEntry {
    // Possibly want a constructor for NNdeclaration with import path.

    // Variable declaration, and NN with import.
    public SymbolTableEntry(String name, String type) {
        this._name = name;
        this._type = type;
        this._isInitialized = false;
    }
    public SymbolTableEntry(String name, String type, boolean initialized) {
        this._name = name;
        this._type = type;
        this._isInitialized = initialized;
    }

    // Vector declaration
    public SymbolTableEntry(String name, String type, String subtype, int length) {
        this._name = name;
        this._type = type;
        this._subtype = subtype;
        this._length = length;
        this._isInitialized = false;
    }
    public SymbolTableEntry(String name, String type, String subtype, int length, boolean initialized) {
        this._name = name;
        this._type = type;
        this._subtype = subtype;
        this._length = length;
        this._isInitialized = initialized;
    }


    // Matrix declaration
    public SymbolTableEntry(String name, String type, String subtype, int[] dimensions) {
        this._name = name;
        this._type = type;
        this._subtype = subtype;
        this._dimensions = dimensions;
        this._isInitialized = false;
    }
    public SymbolTableEntry(String name, String type, String subtype, int[] dimensions, boolean initialized) {
        this._name = name;
        this._type = type;
        this._subtype = subtype;
        this._dimensions = dimensions;
        this._isInitialized = initialized;
    }

    // NN declaration with dimensions
    public SymbolTableEntry(String name, String type, int[] dimensions) {
        this._name = name;
        this._type = type;
        this._dimensions = dimensions;
        this._isInitialized = false;
    }
    public SymbolTableEntry(String name, String type, int[] dimensions, boolean initialized) {
        this._name = name;
        this._type = type;
        this._dimensions = dimensions;
        this._isInitialized = initialized;
    }

    public void MarkAsInitialized() {
        this._isInitialized = true;
    }

    public String getName() {return _name;}
    public String getType() {return _type;}
    public String getSubType() {return _subtype;}
    public int getLength() {return _length;}
    public int[] getDimensions() {return _dimensions;}
    public boolean isInitialized() {return _isInitialized;}

    private String _name;
    private String _type;
    private String _subtype;
    private int _length;
    private int[] _dimensions;
    private boolean _isInitialized;
}
