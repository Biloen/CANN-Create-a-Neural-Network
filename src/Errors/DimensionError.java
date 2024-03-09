package Errors;

public class DimensionError implements IError{
    private String _errorMessage;
    public DimensionError(String id){
        this._errorMessage = "ERROR L.x C.x : " + id;
    }

    @Override
    public void PrintError(){System.out.println(this._errorMessage);}
}
