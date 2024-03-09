package Errors;

public class NotAReal implements IError{
    private String _errorMessage;
    public NotAReal(String id){
        this._errorMessage = "ERROR L.x C.x : The number " + id + "is not a real.";
    }

    @Override
    public void PrintError(){System.out.println(this._errorMessage);}
}
