package Errors;

public class WrongBooleanError implements IError{
    private String _errorMessage;
    public WrongBooleanError(String id){
        this._errorMessage = "ERROR L.x C.x : The boolean " + id + "is not a boolean.";
    }

    @Override
    public void PrintError(){System.out.println(this._errorMessage);}
}
