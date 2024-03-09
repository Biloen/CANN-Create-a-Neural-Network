package Errors;

public class IdentifierUsedBeforeInitializationError implements IError{
    private String _errorMessage;
    public IdentifierUsedBeforeInitializationError(String id){
        this._errorMessage = "ERROR L.x C.x : identifier " + id + " used before it is initialized";
    }
    @Override
    public void PrintError() {
        System.out.println(this._errorMessage);
    }
}
