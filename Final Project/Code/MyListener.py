from antlr4 import *
from gen.JavaLexer import JavaLexer
from gen.JavaParser import JavaParser
from gen.JavaParserListener import JavaParserListener

class EjioguMetricsListener(JavaParserListener):
    def __init__(self):
        super().__init__()
        self.height = 0
        self.twin_number = 0
        self.monadicity = 0
        self.node_count = 0

    def enterClassDeclaration(self, ctx: JavaParser.ClassDeclarationContext):
        self.height = 0
        self.twin_number = 0
        self.monadicity = 0
        self.node_count = 0

    def enterMethodDeclaration(self, ctx: JavaParser.MethodDeclarationContext):
        self.height += 1

    def exitMethodDeclaration(self, ctx: JavaParser.MethodDeclarationContext):
        self.height -= 1

    def enterMethodBody(self, ctx: JavaParser.MethodBodyContext):
        if self.height == 1:
            self.twin_number = len(ctx.children) - 2

    def enterMethodInvocation(self, ctx: JavaParser.MethodInvocationContext):
        if len(ctx.children) == 1:
            self.monadicity += 1

    def enterEveryRule(self, ctx):
        self.node_count += 1

    def calculate_structural_complexity(self):
        sc = self.height * self.twin_number * self.monadicity
        return sc

    def calculate_software_size(self):
        s = self.node_count - 1
        return s