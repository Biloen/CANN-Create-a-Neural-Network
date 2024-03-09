package Errors;

public class EmptyNodeError implements IError{
    private String _errorMessage;
    public EmptyNodeError(String id){
        this._errorMessage = "ERROR L.x C.x : Node has no children";
    }

    @Override
    public void PrintError(){System.out.println(this._errorMessage);}
}
