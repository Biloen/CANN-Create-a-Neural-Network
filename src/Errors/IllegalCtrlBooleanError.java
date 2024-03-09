package Errors;

public class IllegalCtrlBooleanError implements IError{
    private String _errorMessage;
    public IllegalCtrlBooleanError(String id){
        this._errorMessage = "ERROR L.x C.x : Illegal boolean condition in" + id + "loop.";
    }

    @Override
    public void PrintError(){System.out.println(this._errorMessage);}

}
