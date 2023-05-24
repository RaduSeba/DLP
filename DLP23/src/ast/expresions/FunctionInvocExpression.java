package ast.expresions;

import ast.statements.Statement;
import semantic.Visitor;

import java.util.List;

public class FunctionInvocExpression extends AbstractExpression implements Statement,Expression {

    private Variable var;
    private List<Expression> arguments;



    public FunctionInvocExpression(int line, int column,Variable v, List<Expression> expressions) {
        super(line, column);
        this.var=v;
        this.arguments=expressions;
    }



    public Variable getName() {
        return var;
    }

    public List<Expression> getArguments() {
        return arguments;
    }




    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }


}
