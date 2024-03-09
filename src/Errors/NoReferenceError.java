package Errors;

public class NoReferenceError implements IError {
    private String _errorMessage;
    public NoReferenceError(String id){
        this._errorMessage = "ERROR L.x C.x : Inexistent reference to " + id + ".";
    }

    @Override
    public void PrintError(){System.out.println(this._errorMessage);}
}
