package semantic;
import ast.Program;
import ast.definitions.FieldDefinition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expresions.*;
import ast.statements.Assignment;
import ast.statements.Condition;
import ast.statements.Input;
import ast.statements.Return;
import ast.statements.Print;
import ast.statements.While;
import ast.types.*;

public interface Visitor<TP,TR> {

    public TR visit (Program node, TP params);


    public TR visit (FieldDefinition node, TP params );
    public TR visit (FuncDefinition node, TP params );
    public TR visit (VarDefinition node, TP params );

    public TR visit (Arithmetic node, TP params );
    public TR visit (ArrayIndexer node, TP params );
    public TR visit (Cast node, TP params );
    public TR visit (CharLiteral node, TP params );
    public TR visit (Comparison node, TP params );
    public TR visit (  DoubleLiteral node, TP params );
    public TR visit ( FunctionInvocExpression node, TP params );
    public TR visit (  IntLiteral node, TP params );
    public TR visit ( Logic node, TP params );
    public TR visit ( Not node, TP params );
    public TR visit ( RecordNavigation node, TP params );
    public TR visit ( UnaryMinus node, TP params );
    public TR visit ( Variable node, TP params );


    public TR visit (Assignment node, TP params );
    public TR visit (Condition node, TP params );
    public TR visit (Input node, TP params );
    public TR visit ( Print node, TP params );
    public TR visit (Return node, TP params );
    public TR visit (While node , TP params);


    public TR visit (ArrayType node , TP params);
    public TR visit (CharType node , TP params);
    public TR visit (DoubleType node , TP params);
    public TR visit (FunctionType node , TP params);
    public TR visit (IntType node , TP params);
    public TR visit ( StructType node , TP params);
    public TR visit ( VoidType node , TP params);
    public TR visit ( ErrorType node , TP params);











}
