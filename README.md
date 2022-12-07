# Compiler-MJava
## Lista de instalações:
1. sudo apt install antlr4;
2. pip install antlr4-python3-runtime==4.7.2 (garanta que antlr4 e runtime estejam na mesma versão);
## Executando:
"Compilar" a gramática para Python3:
1. antlr4 -Dlanguage=Python3 mjava.g4 -visitor -listener

-visitor e -listener são opcionais.

Para executar o programa:

2. python3 main.py program.mjava

Para compilar o programa:

3. python3 -m PyInstaller --name="MJava" --icon="./MJava.ico" --onefile main.py

Desse modo o programa pode ser executado assim:

4. ./MJava program.mjava
## Sobre o MJava
A Mjava é um subconjunto da linguagem Java. Como é um subconjunto, todo programa MJava é um programa Java válido que pode ser executado pela JVM.

Além disso, Mjava restringe a linguagem Java para ter apenas inteiros, booleanos,
vetores de inteiros e classes, removendo interfaces, números de ponto flutuante, classes abstratas, strings, vetores de outros tipos, etc. Também não há sobrecarga de métodos, ou métodos estáticos, exceto pelo método main da classe principal do programa. O comando System.out.println de MJava só pode imprimir números.

Um programa MJava está restrito a um único arquivo-fonte, não existe o conceito de pacote.
## Sobre o ANTLR
ANTLR (ANother Tool for Language Recognition) é um poderoso gerador de analisador para leitura, processamento, execução, tradução de texto estruturado ou arquivos binários. É amplamente utilizado para construir linguagens, ferramentas e frameworks. A partir de uma gramática, o ANTLR gera um analisador sintático que pode construir e percorrer árvores sintáticas.
### Uso do ANTLR
Em um arquivo com extensão .g4, faça:
```
grammar nome_do_arquivo;

regras: sintáticas;
REGRAS: LÉXICAS;
```
Após isso basta executar e o ANTLR gerará arquivos com os métodos referentes a análise lexa e sintática.

Agora basta realizar o fluxo do compilador:
```
input_stream = FileStream(argv[1]) # Programa a ser analisado (entrada)
lexer = mjavaLexer(input_stream) # Enviar para analise lexa
stream = CommonTokenStream(lexer) # Receber fluxo de tokens
parser = mjavaParser(stream) # Mandar eles para analise sintática
tree = parser.prog() # Informar que a análise começa de prog()
```