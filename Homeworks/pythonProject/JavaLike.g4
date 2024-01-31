grammar JavaLike;

program: classDef EOF;

classDef: 'class' ID '{' classMember* '}' ;

classMember: fieldDecl | methodDecl ;

fieldDecl: typeVar ID ';' ;

methodDecl: typeVar ID '(' paramList? ')' '{' block '}' ;

paramList: paramDecl (',' paramDecl)* ;

paramDecl: typeVar ID ;

typeVar: 'int' | 'boolean' | ID ;

block: statement* ;

statement: expressionStmt | selectionStmt | iterationStmt ;

expressionStmt: expr ';' ;

selectionStmt: 'if' '(' expr ')' statement ( 'else' statement )? ;

iterationStmt: 'while' '(' expr ')' statement | 'for' '(' expr? ';' expr? ';' expr? ')' statement ;

expr: ID | intLiteral | boolLiteral | expr op expr ;

op: '+' | '-' | '*' | '/' | '<' | '>' | '==' | '!=' ;

intLiteral: INT ;

boolLiteral: BOOL ;

ID: [a-zA-Z]+ ;

INT: [0-9]+ ;

BOOL: 'true' | 'false' ;

WS: [ \t\r\n]+ -> skip ;
