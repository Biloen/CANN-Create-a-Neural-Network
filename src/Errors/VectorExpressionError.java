package Errors;

public class VectorExpressionError implements IError{
    private String _errorMessage;

    public VectorExpressionError(String id){
        this._errorMessage = "ERROR L.x C.x :" + id;
    }

    @Override
    public void PrintError(){System.out.println(_errorMessage);}
}
