grammar mjava;
//line 1:0 mismatched input 'class Factorial' expecting 'class'
prog: 
    main classe*
    ;

main: 
    'class' ' ' ID_ '{' 
        'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID_ ')' '{'
            cmd 
        '}' 
    '}'
    ;

classe: 
    'class' ID_ ('[' 'extends' ID_ ']')? '{' 
        (var | metodo)* 
    '}'
    ;

var: 
    tipo ID_ 
    ;

metodo: 
    'public' tipo ID_ '(' (params)? ')' '{' 
        (var | cmd)* 'return' exp ';' 
    '}'
    ;

// Revisar params
params: 
    tipo ID_ (',' tipo ID_)*;

tipo
    : 'int' ('[' ']')*
    | 'int'
    | 'boolean'
    | ID_ 
    ;

cmd
    : '{' (cmd)? '}'
    | 'if' '(' exp ')' cmd
    | 'if' '(' exp ')' cmd 'else' cmd
    | 'while' '(' exp ')' cmd
    | 'System.out.println' '(' exp ')' ';'
    | ID_ '=' exp ';'
    | ID_ '[' exp ']' '=' exp ';'
    ;

exp
    : exp '&&' rexp
    | rexp
    ;

rexp
    : rexp '<' aexp
    | rexp '==' aexp
    | rexp '!=' aexp
    | aexp
    ;

aexp
    : aexp '+' mexp
    | aexp '-' mexp
    | mexp
    ;

mexp
    : mexp '*' sexp
    | mexp '/' sexp
    | sexp
    ;

sexp
    : '!' sexp
    | '-' sexp
    | 'true'
    | 'false'
    | 'num'
    | 'new' 'int' '[' exp ']'
    | pexp '.' 'length'
    | pexp '[' exp ']'
    | pexp
    ;

pexp
    : ID_
    | 'this'
    | 'new' 'id' '(' ')'
    | '(' exp ')'
    | pexp '.' ID_
    | pexp '.' ID_ '(' (exps)* ')' //perguntar bonfim
    ;

exps
    : exp (',' exp)*
    ;

ID_: 
    //[a-z]+
    //ID
    //IDENTIFIER
    ([a-z] | [A-Z]) ([a-z] | [A-Z] | [0-9] | '-' | '_')*
    ;

COMMENT 
    : '/*' TEXT '*/'
    | '//' TEXT LINEBREAK
    ;

TEXT: ([a-z] | [A-Z] | [0-9] | ' ')+;

WHITESPACE
    : ' ' -> skip
    ;

LINEBREAK
    : [\n]+ -> skip
    ;

TAB
    : [\t]+ -> skip
    ;

RETURN
    : [\r]+ -> skip
    ;

PAGEFEATURE
    : [\f]+ -> skip
    ;

//EOF: [\n] ;
/*
Espaços em branco: [ \n \t \r \f ]
• Comentários: dois tipos de comentário, um começando com // e indo até o final
da linha, o outro começando com /* e terminando com */

// COMMENT