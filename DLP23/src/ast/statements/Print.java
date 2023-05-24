package ast.statements;

import ast.expresions.Expression;
import semantic.Visitor;

import java.util.List;

public class Print extends AbstractStatement{


    private List<Expression> expressions;

    public Print(int line, int column, List<Expression> expression) {
        super(line, column);
        this.expressions=expression;

    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
