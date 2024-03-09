package Errors;

public class LoopParameterError implements IError{
    private String _errorMessage;

    public LoopParameterError(String id){
        this._errorMessage = "ERROR L.x C.x : First condition number should be smaller than the second.";
    }

    @Override
    public void PrintError() {System.out.println(this._errorMessage);}
}
