package ast.types;

import errorhandler.ErrorHandler;
import semantic.Visitor;

public class ErrorType extends AbstractType{

    private String s;


    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.s= message;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString() {
        return "There is an error in: line: "+this.getLine()+" - column: "+this.getColumn()+" -->" + s ;
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
