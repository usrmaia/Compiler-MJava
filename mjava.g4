grammar mjava;

WHITESPACE : ([ \b\t\n\r] | COMMENTLINE | COMMENTLINES) -> skip; 

COMMENTLINE
    : '/*' .*? '*/'
    ;

COMMENTLINES
    : '//' .*? [\n] 
    ;

RESERVEDWORDS
    : 'boolean'
    | 'class'
    | 'extends'
    | 'public'
    | 'static'
    | 'void'
    | 'main'
    | 'String'
    | 'return'
    | 'int'
    | 'if'
    | 'else'
    | 'while'
    | 'System.out.println'
    | 'length'
    | 'true'
    | 'false'
    | 'this'
    | 'new'
    ;

NUMBER
    : [0-9]+
    ;

OPERATORSPOINTING
    : '('
    | ')'
    | '['
    | ']'
    | '{'
    | '}'
    | ';'
    | '.'
    | ','
    | '='
    | '<'
    | '=='
    | '!='
    | '+'
    | '-'
    | '*'
    | '/'
    | '&&'
    | '!'
    ;


ID
    : ([a-z] | [A-Z]) ([a-z] | [A-Z] | [0-9] | '_' | '-')*
    ;

prog: 
    main
    classe*
    ;

main: 
    'class' ID '{' 
        'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' '{'
            cmd? 
        '}' 
    '}'
    ;

classe: 
    'class' ID ('extends' ID)? '{' 
        (var | metodo)* 
    '}'
    ;

var: 
    tipo ID ';'
    ;

metodo: 
    'public' tipo ID '(' (params)? ')' '{' 
        (var | cmd)* 'return' exp ';' 
    '}'
    ;

// Revisar params
params: 
    tipo ID (',' tipo ID)*;

tipo
    : 'int' ('[' ']')*
    | 'int'
    | 'boolean'
    | ID 
    ;

cmd
    : '{' (cmd)? '}'
    | 'if' '(' exp ')' cmd
    | 'if' '(' exp ')' cmd 'else' cmd
    | 'while' '(' exp ')' cmd
    | 'System.out.println' '(' exp ')' ';'
    | ID '=' exp ';'
    | ID '[' exp ']' '=' exp ';'
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
    //| 'num' //perguntar
    | 'new' 'int' '[' exp ']'
    | pexp '.' 'length'
    | pexp '[' exp ']'
    | pexp
    ;

pexp
    : ID
    | NUMBER //nao havia numeros
    | 'this'
    | 'new' ID '(' ')'
    | '(' exp ')'
    | pexp '.' ID
    | pexp '.' ID '(' (exps)? ')' //perguntar bonfim
    ;

exps
    : exp (',' exp)*
    ;