from gen.JavaParser import *
import networkx as nx
import math
import time

class node :
    def __int__(self):
        self.number = 0
        self.next = None
        self.next_divert = None

class graph:
    def __init__(self):
        self.nodes = []
        # self.edges = {}
        self.edges_numbers = 0
        self.current_node = None
        self.last_node_numbers = 0

    def create_node_for_while(self):
        first = node()
        second = node()
        third = node()
        if self.current_node == None:
            self.current_node = first
        else:
            self.current_node.next = first
            self.edges_numbers = self.edges_numbers + 1
        #----------
        first.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        first.next = second
        self.edges_numbers = self.edges_numbers + 1
        self.nodes.append(first)
        #----------
        second.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        second.next_divert = third
        self.edges_numbers = self.edges_numbers + 1
        self.nodes.append(second)
        #----------
        third.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        third.next = first
        self.edges_numbers = self.edges_numbers + 1
        self.nodes.append(third)
        #----------
        second.next = None
        self.current_node = second
    def create_node_if_else(self):
        first = node()
        second = node()
        third = node()
        if self.current_node == None:
            self.current_node = first
        else:
            self.current_node.next = first
            self.edges_numbers = self.edges_numbers + 1
        #----------
        first.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        first.next = second
        self.edges_numbers = self.edges_numbers + 1
        self.nodes.append(first)
        first.next_divert = third
        self.edges_numbers = self.edges_numbers + 1
        #----------
        second.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        second.next = None
        self.nodes.append(second)
        #----------
        third.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        third.next = second
        self.edges_numbers = self.edges_numbers + 1
        self.nodes.append(third)
        #----------
        self.current_node = second

    def create_node_assignement(self):
        first = node()
        if self.current_node == None:
            self.current_node = first
        else:
            self.current_node.next = first
            self.edges_numbers = self.edges_numbers + 1
        #----------
        first.number = self.last_node_numbers + 1
        self.last_node_numbers = self.last_node_numbers + 1
        first.next = None
        self.nodes.append(first)
        #----------
        self.current_node = first







class CustomListener(ParseTreeListener):
    def __init__(self):
        self.graph = nx.DiGraph()
        self.Fan = 0
        self.Fout = 0
        self.IFC = 0
        self.inMethod = False
        self.variables = []
        self.eachIFC = {}
        self.starttime = 0
        self.endtime = 0


    def enterVariableDeclarator(self, ctx:JavaParser.VariableDeclaratorContext):
        if self.inMethod == True :
            self.variables.append( ctx.variableDeclaratorId().Identifier())
            self.Fan = self.Fan + 1
            self.Fout = self.Fout + 1

    def enterFormalParameter(self, ctx:JavaParser.FormalParameterContext):
        self.variables.append( ctx.variableDeclaratorId().Identifier())
        self.Fan = self.Fan + 1

    def enterMethodDeclaration(self, ctx:JavaParser.MethodDeclarationContext):
        self.inMethod = True

    def exitMethodDeclaration(self, ctx:JavaParser.MethodDeclarationContext):
        self.inMethod = False
        start_line = ctx.start.line
        stop_line = ctx.stop.line
        # Calculate the number of lines
        lines_in_context = stop_line - start_line + 1
        me_ifc = lines_in_context *  math.pow( (self.Fan * self.Fout) , 2 )
        self.IFC = self.IFC + me_ifc
        self.eachIFC[ctx.methodHeader().methodDeclarator().Identifier()] = me_ifc
        self.Fan = 0
        self.Fout = 0
        self.variables = []

        # Enter a parse tree produced by JavaParser#leftHandSide.
    def enterLeftHandSide(self, ctx: JavaParser.LeftHandSideContext):
        if ctx.expressionName().Identifier() not in self.variables :
            self.Fout = self.Fout + 1

    def exitCompilationUnit(self, ctx: JavaParser.CompilationUnitContext):
        self.starttime = time.time()
    def exitCompilationUnit(self, ctx: JavaParser.CompilationUnitContext):
        self.endtime = time.time()
        print("---------------------------------------------------------------------\nHenry and Kafura’s Information Software Metrics \n--------------------------------------------------------------------- ")
        # print(self.operators)
        print(f"the number of procedures : {len(self.eachIFC)}")
        print(f"the formula for IFC is : Length * (Fin * Fout)^2")
        print("print the each procedure IFC :")
        for key, value in self.eachIFC.items():
            print(f'{key}: {value}')
        # print(self.operands)
        print(f"the total IFC is : {self.IFC}")
        print("************** Performance ****************")
        print("related metrics :")
        print(f"IFC : {self.IFC}")
        print(f"time to response : {self.endtime - self.starttime} seconds")

        print("---------------------------------------------------------------------")
        print("---------------------------------------------------------------------\n\n")
    #
    #
    #
    #
    # def flexbility_factcor(self):
    #     print("The First Software Quality Factor is *Flexibility*")
    #     print(f"The Cyclomatic Complexity Metric is: {self.graphh.edges_numbers - self.graphh.last_node_numbers + 2} ")
    #     print(f"The Lines of Code Metric is: {self.line_count}")
    #     halsted_volume = (self.N1_operators + self.N2_operands) * (
    #         math.log(self.n1_uniquieoperators + self.n2_uniqueoperands, 2))
    #     Cyclomatic = self.graphh.edges_numbers - self.graphh.last_node_numbers + 2
    #     print(f"The Maintainability Index (MI) Metric is: {171 - 5.2 * math.log(halsted_volume , 2) - 0.23 * Cyclomatic - math.log(self.line_count, 2) }")
    #     print(
    #         f"The McCabe's Cyclomatic Complexity (MCC): {self.graphh.edges_numbers - self.graphh.last_node_numbers + 2}")
    #     print("---------------------------------------------------------------------")
    #     print("---------------------------------------------------------------------\n\n")
    #
    #
    # def complexity_factor(self):
    #     halsted_volume = (self.N1_operators + self.N2_operands) * (
    #         math.log(self.n1_uniquieoperators + self.n2_uniqueoperands, 2))
    #     Cyclomatic = self.graphh.edges_numbers - self.graphh.last_node_numbers + 2
    #
    #     print("The First Software Quality Factor is *Complexity*")
    #     print(f"The Cyclomatic Complexity Metric is: {self.graphh.edges_numbers - self.graphh.last_node_numbers + 2} ")
    #     print(f"The Halsted Volume Metric is: {halsted_volume}")
    #     print(
    #         f"The McCabe's Cyclomatic Complexity (MCC): {self.graphh.edges_numbers - self.graphh.last_node_numbers + 2}")
    #     print(
    #         f"The Maintainability Index (MI) Metric is: {171 - 5.2 * math.log(halsted_volume, 2) - 0.23 * Cyclomatic - math.log(self.line_count, 2)}")
    #     print(f"The Lines of Code Metric is: {self.line_count}")
    #     print("---------------------------------------------------------------------")
    #     print("---------------------------------------------------------------------\n\n")