package ast.expresions;

import ast.types.Type;
import semantic.Visitor;

public class Cast extends  AbstractExpression{

    private Type type;
    private Expression expression;

    public Cast(int line, int column, Type type, Expression expression) {
        super(line,column);
        this.type = type;
        this.expression = expression;
    }



    public Expression getExpression() {
        return expression;
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
