import sys
from antlr4 import *
from mjavaLexer import mjavaLexer
from mjavaParser import mjavaParser
from mjavaListener import mjavaListener

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = mjavaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = mjavaParser(stream)
    tree = parser.prog()
    parser.ProgContext(tree)
    #print(tree.input_txt())

    lisp_tree_str = tree.toStringTree(recog=parser)
    print(lisp_tree_str)

    walker = ParseTreeWalker()
    walker.walk(mjavaListener(), tree)
    print()

if __name__ == '__main__':
    main(sys.argv)