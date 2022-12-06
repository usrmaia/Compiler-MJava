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
## Sobre o MJava
A Mjava é um subconjunto da linguagem Java. Como é um subconjunto, todo programa Mava é um programa Java válido que pode ser executado pela JVM.

Além disso, Mjava restringe a linguagem Java para ter apenas inteiros, booleanos,
vetores de inteiros e classes, removendo interfaces, números de ponto flutuante, classes abstratas, strings, vetores de outros tipos etc. Também não há sobrecarga de métodos, ou métodos estáticos, exceto pelo método main da classe principal do programa. O comando System.out.println de MJava só pode imprimir números.

Um programa MJava está restrito a um único arquivo fonte, não existe o conceito de
pacote.