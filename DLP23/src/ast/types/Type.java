package ast.types;

import ast.ASTNode;
import ast.definitions.FieldDefinition;
import ast.expresions.Expression;

import java.util.List;

public interface Type extends ASTNode {

    public boolean isLogical();

    public Type arithmetic(Type other,ASTNode node);

    public Type arithmetic(ASTNode node);

    public Type comparison(Type other,ASTNode node);

    public Type logical(Type other,ASTNode node);

    public Type logical(ASTNode node);

    public Type dot(String field,ASTNode node);



    public boolean isBuiltinType();

    public Type cast(Type type,ASTNode node);

    public Type squareBrackets(Type type,ASTNode node);

    public Type parenthesis(List<Expression> types, ASTNode node);

    public Type promotesTo(Type type,ASTNode node);

    public FieldDefinition getFieldDefinition(String name);


    public int numberOfBytes();

    public char suffix();

}
