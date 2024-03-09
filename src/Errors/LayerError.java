package Errors;

public class LayerError implements IError{
    private String _errorMessage;
    public LayerError(String id){
        this._errorMessage = "ERROR L.x C.x : " + id;
    }

    @Override
    public void PrintError(){System.out.println(this._errorMessage);}
}
