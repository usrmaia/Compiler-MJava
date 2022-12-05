grammar mjava;
//line 1:0 mismatched input 'class Factorial' expecting 'class'
prog: 
    main (classe)*
    ;

main: 
    'class' ID_ '{' 
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

/*
Caso 1
○ A → Aα | β

○ A → βR
○ R → αR | ε

Caso 2
○ expr → expr ‘+’ termo | expr ‘-’ termo | termo | constante

○ expr → termo expr2 | constante expr2
○ expr2 → ‘+’ termo expr2 | ‘-’ termo expr2 | ε
*/
/*
exp
    : exp '&&' rexp
    | rexp
    ;
*/

exp
    : rexp | rexp '&&' exp ;

/*
rexp
    : rexp '<' aexp
    | rexp '==' aexp
    | rexp '!=' aexp
    | aexp
    ;
*/

rexp:
    aexp | aexp ('<' | '==' | '!=') rexp
    ;

/*
aexp
    : aexp '+' mexp
    | aexp '-' mexp
    | mexp
    ;
*/

aexp:
    mexp | mexp ('+' | '-') aexp
    ;

/*
mexp
    : mexp '*' sexp
    | mexp '/' sexp
    | sexp
    ;
*/

mexp:
    sexp | sexp ('*' | '/') mexp ;

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

/*
pexp
    : ID
    | 'this'
    | 'new' ID '(' ')'
    | '(' exp ')'
    | pexp '.' ID
    | pexp '.' ID '(' '[' exps ']' ')'
    ;
*/

pexp:
    '.' ID_ | '.' ID_ '(' '[' exps ']' ')' |
    '.' ID_ pexp | '.' ID_ '(' '[' exps ']' ')' pexp|
    ID_
    | 'this'
    | 'new' ID_ '(' ')'
    | '(' exp ')'
;


exps: 
    exp (',' exp)*
    ;
ID_: 
    //[a-z]+
    //ID
    //IDENTIFIER
    ([a-z] | [A-Z]) ([a-z] | [A-Z] | [0-9] | '-' | '_')*
    ;

COMMENT 
    : '/*' TEXT '*/'
    | '//' TEXT EOF
    ;
TEXT : ([a-z] | [A-Z] | [0-9] | ' ')+;
WHITESPACE
    : [\n]+ -> skip
    ;
//EOF: [\n] ;
/*
Espaços em branco: [ \n \t \r \f ]
• Comentários: dois tipos de comentário, um começando com // e indo até o final
da linha, o outro começando com /* e terminando com */

// COMMENT