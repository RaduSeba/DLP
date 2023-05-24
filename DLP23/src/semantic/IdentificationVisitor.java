package semantic;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expresions.Variable;
import ast.types.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void,Void>{

    private SymbolTable table;

    public IdentificationVisitor()
    {
        this.table= new SymbolTable();
    }

    public Void visit(VarDefinition node, Void params)
    {
        if(!table.insert(node))
        {
            new ErrorType(node.getLine(),node.getColumn(),"Error IdentificationVisitor: variable "+node.getName()+" is already defined");

        }

       // node.getType().accept(this, params);
        return null;
    }



    public Void visit(FuncDefinition node, Void params)
    {
        if(!table.insert(node))
        {
            new ErrorType(node.getLine(),node.getColumn(),"Error IdentificationVisitor: variable "+node.getName()+" is already defined");

        }
        table.set();
        super.visit(node,params);
        table.reset();
        return null;
    }

    public Void visit (Variable node, Void params)
    {
        node.setDefinition(table.find(node.getName()));
        if(node.getDefinition()==null)
        {
            node.setDefinition(new VarDefinition(node.getLine(),node.getColumn()
                    ,node.getName(),new ErrorType(node.getLine(),node.getColumn(),"Error IdentificationVisitor: variable  is already defined")));
        }
        return null;
    }






}
