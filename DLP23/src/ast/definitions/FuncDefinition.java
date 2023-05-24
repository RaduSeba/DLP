package ast.definitions;

import ast.statements.Statement;
import ast.types.Type;
import semantic.Visitor;

import java.util.List;

public class FuncDefinition  extends AbstractDefinition{

    private String name;
    private Type functionType;

    private int localVariablesBytes = 0;

    private List<Statement> statements;
    private List<Definition> varDefinitions;

    public FuncDefinition(int line, int column,String n,Type t,List<Definition> varDefinitions ,List<Statement> statements) {
        super(line, column);
        this.name=n;
        this.functionType=t;
        this.statements= statements;
        this.varDefinitions=varDefinitions;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return functionType;
    }

    @Override
    public void setType(Type type) {
        this.functionType=type;

    }

    @Override
    public int getScope() {
        return 0;
    }

    @Override
    public void setScope(int scope) {

    }



    public List<Statement> getStatements() {
        return statements;
    }

    public List<Definition> getVarDefinitions() {
        return varDefinitions;
    }

    public int getLocalVariablesBytes() {
        return localVariablesBytes;
    }

    public void setLocalVariablesBytes(int localVariablesBytes) {
        this.localVariablesBytes = localVariablesBytes;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
