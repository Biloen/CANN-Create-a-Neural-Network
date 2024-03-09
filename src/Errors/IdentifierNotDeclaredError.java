package Errors;

public class IdentifierNotDeclaredError implements IError{
    private String _errorMessage;
    public IdentifierNotDeclaredError(String id) {
        this._errorMessage = "ERROR L.x C.x : identifier " + id + " used but is not yet declared.";
    }
    @Override
    public void PrintError() {
        System.out.println(this._errorMessage);
    }
}
