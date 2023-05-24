package errorhandler;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private List<ErrorType> errors = new ArrayList<ErrorType>();

    private static  ErrorHandler instance = null;

    private ErrorHandler(){ };

    public static  ErrorHandler getInstance()
    {
        if(instance==null)
        {
            instance= new ErrorHandler();
        }
        return instance;
    }

    public boolean anyError() {
        if(errors.isEmpty())
            return false;
        else
            return true;
    }

    public void addError(ErrorType error) {
        errors.add(error);
    }

    public void showErrors(PrintStream p)
    {
        for(ErrorType e:errors)
        {
            p.println(e);
        }
    }


}
