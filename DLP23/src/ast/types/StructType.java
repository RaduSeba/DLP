package ast.types;

import ast.ASTNode;
import ast.definitions.FieldDefinition;
import semantic.Visitor;

import java.util.List;
public class StructType extends AbstractType{

    private List<FieldDefinition> fields;

    public StructType(int line, int column, List<FieldDefinition> fields) {
        super(line,column);
        this.fields = fields;
    }

    public List<FieldDefinition> getFields() {
        return fields;
    }

    @Override
    public Type dot(String field, ASTNode node) {
        for(FieldDefinition f : fields)
        {
            if(f.getName().equals(field))
            {
                return f.getType();
            }
        }
        return super.dot(field,node);
    }

    @Override
    public int numberOfBytes() {
        int c =0;
        for(FieldDefinition f : fields)
            c = c+ f.getType().numberOfBytes();

        return c;
    }

    public  FieldDefinition getFieldDDefinition(String name){
        for(FieldDefinition f : fields){
            if(name.equals((f.getName())))
                return f;
        }
        return null;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
