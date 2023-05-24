package ast;

import ast.definitions.Definition;
import semantic.Visitor;

import java.util.List;

public class Program implements ASTNode{

    private int line;
    private int column;

    private List<Definition> definitions;



    public Program(int line, int column, List<Definition> definitions) {
        this.line = line;
        this.column = column;
        this.definitions = definitions;
    }


    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
