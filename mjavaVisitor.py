# Generated from mjava.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .mjavaParser import mjavaParser
else:
    from mjavaParser import mjavaParser

# This class defines a complete generic visitor for a parse tree produced by mjavaParser.

class mjavaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by mjavaParser#prog.
    def visitProg(self, ctx:mjavaParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#main.
    def visitMain(self, ctx:mjavaParser.MainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#classe.
    def visitClasse(self, ctx:mjavaParser.ClasseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#var.
    def visitVar(self, ctx:mjavaParser.VarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#metodo.
    def visitMetodo(self, ctx:mjavaParser.MetodoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#params.
    def visitParams(self, ctx:mjavaParser.ParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#tipo.
    def visitTipo(self, ctx:mjavaParser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#cmd.
    def visitCmd(self, ctx:mjavaParser.CmdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#exp.
    def visitExp(self, ctx:mjavaParser.ExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#rexp.
    def visitRexp(self, ctx:mjavaParser.RexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#aexp.
    def visitAexp(self, ctx:mjavaParser.AexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#mexp.
    def visitMexp(self, ctx:mjavaParser.MexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#sexp.
    def visitSexp(self, ctx:mjavaParser.SexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#pexp.
    def visitPexp(self, ctx:mjavaParser.PexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by mjavaParser#exps.
    def visitExps(self, ctx:mjavaParser.ExpsContext):
        return self.visitChildren(ctx)



del mjavaParser