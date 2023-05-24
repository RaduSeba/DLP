package ast.expresions;

import semantic.Visitor;

public class CharLiteral extends AbstractExpression{

    private char value;

    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value= value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }


}
