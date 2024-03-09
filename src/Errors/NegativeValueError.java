package Errors;

public class NegativeValueError implements IError{
    private String _errorMessage;
    public NegativeValueError(String id){
        this._errorMessage = id + "must be positive.";
    }

    @Override
    public void PrintError(){System.out.println(this._errorMessage);};
}
