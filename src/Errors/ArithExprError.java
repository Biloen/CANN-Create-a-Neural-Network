package Errors;

public class ArithExprError implements IError{
    private String _errorMessage;
    public ArithExprError(String id){
        this._errorMessage = "ERROR L.x C.x :" + id + ".";
    }

    @Override
    public void PrintError(){System.out.println(this._errorMessage);}
}
