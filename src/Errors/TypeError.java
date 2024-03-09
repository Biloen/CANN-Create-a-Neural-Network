package Errors;

public class TypeError implements IError {
    private String _errorMessage;
    public TypeError (String id) {
        this._errorMessage = "ERROR L.x C.x : " + id;
    }
    @Override
    public void PrintError() {
        System.out.println(this._errorMessage);
    }
}
