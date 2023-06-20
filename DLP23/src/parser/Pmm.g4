grammar Pmm;

@header{
    import ast.expresions.*;
    import ast.*;
    import ast.definitions.*;
    import ast.statements.*;
    import ast.types.*;
    import errorhandler.*;
}



program returns [Program ast]: {List<Definition> defs=new ArrayList<Definition>();} definitions{defs.addAll($definitions.ast);}  D='def' 'main' '(' ')' ':' '{' {List<Definition> def=new ArrayList<Definition>();}(v1=var_def {def.addAll($v1.ast);} ';' )* {List<Statement> sts=new ArrayList<Statement>();}(statement{sts.add($statement.ast);})* '}' EOF
            {defs.add(new FuncDefinition($start.getLine(), $start.getCharPositionInLine()+1, "main",new FunctionType($D.getLine(),$D.getCharPositionInLine()+1,new VoidType($D.getLine(),$D.getCharPositionInLine()+1),new ArrayList<Definition>()),def,sts));}
            {$ast=new Program($definitions.start.getLine(),$definitions.start.getCharPositionInLine()+1,defs);}
       ;

definitions  returns [List<Definition> ast=new ArrayList<Definition>()] :  (var_def ';' {$ast.addAll($var_def.ast);} | func_def{$ast.add($func_def.ast);} )*
        ;

/***Expressions***/
expression  returns [ Expression ast] :
                 '(' e1=expression ')' { $ast = $e1.ast;  }
                | e1=expression '[' e2=expression ']' { $ast = new ArrayIndexer($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast);}
                | e1=expression '.' ID { $ast = new RecordNavigation($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$ID.text ,$e1.ast);  }
                  | '(' t=type ')' e1=expression {$ast = new Cast($t.start.getLine(), $t.start.getCharPositionInLine()+1, $t.ast, $e1.ast);}
                | '!' e1=expression{ $ast = new Not($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast );   }
                | '-' e1=expression {$ast = new UnaryMinus($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast);  }
                 | e1=expression OP=('*'|'/'|'%') e2=expression { $ast = new  Arithmetic($e1.start.getLine(),$e1.start.getCharPositionInLine()+1,$e1.ast,$OP.text,$e2.ast);  }
                | exp1= expression OP=('+'|'-') exp2= expression {  $ast=  new Arithmetic($exp1.start.getLine(),   $exp1.start.getCharPositionInLine()+1, $exp1.ast,  $OP.getText()   ,$exp2.ast );   }
                | e1=expression OP=('&&'|'||') e2=expression {$ast = new Logic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1,$e1.ast,$e2.ast,$OP.text);}
                | e1=expression OP= ('>='|'=='| '>'|'<'|'<='|'!=') e2=expression {$ast = new Comparison($e1.start.getLine(),$e1.start.getCharPositionInLine()+1,$e1.ast,$e2.ast,$OP.text);}
                | f=function_call_expression{$ast=$f.ast;}
                 | INT_CONSTANT { $ast = new IntLiteral ($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.getText()));  }
                 | CHAR_CONSTANT{$ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.getText()));}
                 | REAL_CONSTANT{ $ast  = new DoubleLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($REAL_CONSTANT.getText()));}
                 | ID {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.getText());}
        ;

function_call_expression returns [Expression ast]:
        ID a=arguments {$ast = new  FunctionInvocExpression($ID.getLine(),$ID.getCharPositionInLine()+1, new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text),$a.ast); }

        ;

expressions returns [List<Expression> ast = new ArrayList<Expression>()]: e1=expression {$ast.add($e1.ast);} (',' e2=expression {$ast.add($e2.ast);} )*

    ;


/***Types***/
type returns [Type ast]:  t='char' {$ast = new  CharType($t.getLine(),$t.getCharPositionInLine()+1);}
       | t='int' {$ast = new IntType($t.getLine(), $t.getCharPositionInLine()+1);}
       | t= 'double' {$ast = new DoubleType($t.getLine(), $t.getCharPositionInLine()+1);}
       | '[' INT_CONSTANT ']' type {$ast = new ArrayType($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1,$type.ast,LexerHelper.lexemeToInt($INT_CONSTANT.text));}
       | t='struct' '{'  f=field  '}' {$ast = new StructType($t.getLine(),$t.getCharPositionInLine()+1,$f.ast);}
     ;




field returns [List<FieldDefinition> ast = new ArrayList<FieldDefinition>()] :
         (id1=ID {if($ast.contains(new FieldDefinition($id1.getLine(), $id1.getCharPositionInLine()+1,$id1.text,null))){new ErrorType($id1.getLine(), $id1.getCharPositionInLine()+1, "Duplicate field error: " + $id1.text);}else {$ast.add(new FieldDefinition($id1.getLine(), $id1.getCharPositionInLine()+1,$id1.text,null));}}
	 (','id2=ID {if($ast.contains(new FieldDefinition($id2.getLine(), $id2.getCharPositionInLine()+1,$id2.text,null))){new ErrorType($id2.getLine(), $id2.getCharPositionInLine()+1, "Duplicate field error: " + $id2.text);}else {$ast.add(new FieldDefinition($id2.getLine(), $id2.getCharPositionInLine()+1,$id2.text,null));}})* ':' type ';' {for(FieldDefinition d: $ast){if(d.getType()==null)d.setType($type.ast);}})*

            ;



/***Statements***/

statement returns [Statement ast] : f=function_call_statement ';' {$ast= $f.ast;}
            | ifs= if_statement {$ast= $ifs.ast;}
            | rs =return_statement {$ast = $rs.ast;}
            | in= input {$ast = $in.ast;}
            | p= print {$ast = $p.ast;}
            | w= while {$ast = $w.ast;}
            | a =assignation {$ast = $a.ast;}


         ;


function_call_statement  returns [Statement ast]: ID a=arguments{$ast = new  FunctionInvocExpression($ID.getLine(),$ID.getCharPositionInLine()+1, new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text),$a.ast); }

    ;

arguments returns [List<Expression> ast=new ArrayList<Expression>()] : '('')'
          | '(' es=expressions ')' {$ast = $es.ast;}
         ;

if_statement  returns [Statement ast]: 'if' e1=expression ':' b=body {Condition cond = new Condition($e1.start.getLine(),$e1.start.getCharPositionInLine()+1,$e1.ast,$b.ast, new ArrayList<Statement>()); } (es=else_statement {cond.setElseBody($es.ast);})? {$ast=cond;}
            ;


else_statement returns [List<Statement> ast]: 'else' ':' b=body {$ast= $b.ast;}

        ;

 body returns [List<Statement> ast=new ArrayList<Statement>()] :  s=statement {$ast.add($s.ast);}
       | '{' (s=statement{$ast.add($s.ast);})+ '}'
       ;

return_statement returns [Statement ast]: 'return' e1=expression ';' {$ast = new Return($e1.start.getLine(),$e1.start.getCharPositionInLine()+1,$e1.ast);}

        ;

input returns [Statement ast] : 'input' es=expressions ';' {$ast = new Input($es.start.getLine(),$es.start.getCharPositionInLine()+1,$es.ast);}

        ;

print returns [Statement ast] : 'print' es=expressions ';' {$ast = new Print($es.start.getLine(),$es.start.getCharPositionInLine()+1,$es.ast);}

    ;

while  returns [Statement ast]: 'while' e1=expression ':' b=body {$ast = new While($e1.start.getLine(),$e1.start.getCharPositionInLine()+1,$e1.ast,$b.ast);}

        ;

assignation returns [Statement ast]: e1= expression '=' e2= expression ';' {$ast = new Assignment($e1.start.getLine(),$e1.start.getCharPositionInLine()+1,$e1.ast,$e2.ast);}
            ;

/***Definitions***/

simple_def returns [Definition ast]: ID ':' type {$ast = new VarDefinition ($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.text,$type.ast);}

    ;

assign_def returns [Definition ast]: ID ':' type '=' e1=expression  {$ast = new AssignDefinition($ID.getLine(),$ID.getCharPositionInLine()+1, $e1.ast, $ID.text, $type.ast);}
            ;

multi_def returns [List<Definition> ast = new ArrayList<Definition>()] :  id1=ID {$ast.add(new VarDefinition($id1.getLine(), $id1.getCharPositionInLine()+1, $id1.text, null));}
           (','id2=ID {if($ast.contains(new VarDefinition($id2.getLine(), $id2.getCharPositionInLine()+1, $id2.text, null))){new ErrorType($id2.getLine(), $id2.getCharPositionInLine()+1, "Duplicate variable definition error: " + $id2.text);}else{$ast.add(new VarDefinition($id2.getLine(), $id2.getCharPositionInLine()+1, $id2.text, null));}})+ ':' type {for(Definition d: $ast){d.setType($type.ast);}}
         ;

var_def returns [List<Definition> ast = new ArrayList<Definition>()]: simple_def {$ast.add($simple_def.ast);}
        | multi_def {$ast.addAll($multi_def.ast);}
        | assign_def  {$ast.add($assign_def.ast);}


    ;

func_def returns [Definition ast]: 'def' ID parameters ':'  {Type returnType= new VoidType ($ID.getLine(),$ID.getCharPositionInLine()+1);} (type {returnType = $type.ast;} )? '{'  {List<Definition> defs=new ArrayList<Definition>();} (var_def {defs.addAll($var_def.ast);} ';')* {List<Statement> sts=new ArrayList<Statement>();}(statement{sts.add($statement.ast);})* '}'
{$ast=new FuncDefinition($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text,new FunctionType($ID.getLine(),$ID.getCharPositionInLine()+1,returnType,$parameters.ast),defs,sts);}
;

parameters returns [List<Definition> ast = new ArrayList<Definition>()]:'('')'
            | '(' s1=simple_def{$ast.add($s1.ast);} (',' s2=simple_def {$ast.add($s2.ast);} )* ')'
    ;

main_def returns [Definition ast]: d='def' 'main' '(' ')' ':' '{' {List<Definition> defs=new ArrayList<Definition>();}(v1=var_def {defs.addAll($v1.ast);} ';' )* {List<Statement> sts=new ArrayList<Statement>();}(statement{sts.add($statement.ast);})* '}' EOF
 { $ast = new FuncDefinition($start.getLine(), $start.getCharPositionInLine()+1, "main",new FunctionType($d.getLine(),$d.getCharPositionInLine()+1,new VoidType($d.getLine(),$d.getCharPositionInLine()+1),new ArrayList<Definition>()),defs,sts); }
 ;










INT_CONSTANT: [1-9][0-9]* | '0'
            ;

REAL_CONSTANT: INT_CONSTANT?'.'INT_CONSTANT
			|  INT_CONSTANT'.'
			|  INT_CONSTANT ('.' INT_CONSTANT)?[Ee][+-]?INT_CONSTANT
			;

CHAR_CONSTANT:'\''.'\''
			| '\'''\\'INT_CONSTANT'\''
			| '\'''\\n''\''
			| [']'\\t'[']
			;

ID: [a-zA-Z_][a-zA-Z0-9_]*
			;

COMMENTEND: '#'~[\r\n]*[\n\rEOF]*->skip
		;


COMMENT: '"""'.*?'"""'->skip
            		;


TRASH: [\n\r\t ] -> skip
    ;
