import sys
from antlr4 import *
from mjavaLexer import mjavaLexer
from mjavaParser import mjavaParser
from mjavaListener import mjavaListener

def main(argv):
    input_stream = FileStream(argv[1])
    #print(input_stream)
    lexer = mjavaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = mjavaParser(stream)
    tree = parser.prog()
    parser.ProgContext(tree)

    lisp_tree_str = tree.toStringTree(recog=parser)
    #print(lisp_tree_str)

    walker = ParseTreeWalker()
    walker.walk(mjavaListener(), tree)

if __name__ == '__main__':
    main(sys.argv)
    # antlr4 -Dlanguage=Python3 mjava.g4 -visitor -listener
    # python3 main.py program.mjava 
    # python3 -m PyInstaller --name="MJava" --icon="./MJava.ico" --onefile main.py