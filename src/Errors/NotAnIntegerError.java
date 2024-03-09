package Errors;

public class NotAnIntegerError implements IError{
    private String _errorMessage;
    public NotAnIntegerError(String id){
        this._errorMessage = "ERROR L.x C.x : Number " + id + "is not an integer.";
    }

    @Override
    public void PrintError(){System.out.println(this._errorMessage);}
}
