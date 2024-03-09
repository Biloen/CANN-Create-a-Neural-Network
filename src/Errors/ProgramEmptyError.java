package Errors;

public class ProgramEmptyError implements IError{
    private String _errorMessage;
    public ProgramEmptyError(String id)
    {
        this._errorMessage = "ERROR L.x C.x : The program cannot be empty.";
    }

    @Override
    public void PrintError(){System.out.println(this._errorMessage);}
}
