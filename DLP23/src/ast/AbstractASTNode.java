package ast;

public abstract class AbstractASTNode implements ASTNode {

    private int line;
    private int column;

    public AbstractASTNode(int line, int column) {
        this.line=line;
        this.column=column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

}
