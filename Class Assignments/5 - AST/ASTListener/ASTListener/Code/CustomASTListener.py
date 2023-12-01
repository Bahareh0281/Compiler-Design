import queue
import networkx as nx
import matplotlib.pyplot as plt
from tkinter import ttk
import tkinter as tk

from Gen.AssignmentStatementListener import AssignmentStatementListener
from Gen.AssignmentStatementParser import AssignmentStatementParser

class ASTListener(AssignmentStatementListener):
    def __init__(self):
        self.ast = AST()               # Data structure for holding the abstract syntax tree
        self.q = queue.Queue()         # Use to print and visualize InClassPresentation
        self.g = nx.DiGraph()          # Use to visualize InClassPresentation
        self.max_x = 0

# -------------------------------------------------------
    def draw_tree(self, node, x, y):
        if node is None:
             return
        # Draw the node
        if x < self.max_x:
            x = self.max_x
        plt.plot(x, y, 'o', markersize=15, color='cyan')
        plt.text(x, y, str(node.value), ha='center', va='center')
        print("x = ", x, "max_x ", self.max_x," y = ", y, " nd: ", node.value)
        if node.brother is not None:
            print("brother of ", node.value, " is", node.brother.value)
        if node.child is not None:
            print("child of ", node.value, " is", node.child.value)
        
        # Draw the vertical line to the first child
        if node.child is not None:
            plt.plot([x, x], [y - 0.1, y - 1], 'k-', linewidth=2, color='red')
            self.draw_tree(node.child, x, y - 1)

        # Draw the horizontal line to the first brother
        if node.brother is not None:
            plt.plot([x + 0.1, self.max_x +  1], [y, y], 'k-', linewidth=2, color='red')
            print("----x is :", x, "self.max_x ", self.max_x)
            self.max_x += 1
            self.draw_tree(node.brother, x + 1, y)

    def transform_binary_tree(self, root):
        if root is None:
            return None

        tree=ttk.Treeview()
        nodes={}

        def traverse(node, parent, iid=None):
            if node is None:
                return

            node_id=len(nodes)
            nodes[node_id]=node

            if parent is None:
                iid=tree.insert('', 'end', text=str(node.value))
            else:
                iid=tree.insert(parent, 'end', text=str(node.value))

            traverse(node.child, iid)
            traverse(node.brother, parent)

        traverse(root, None)
        return tree

    def display_treeview(self, tree):
        tree.pack()
        tk.mainloop()

    # -------------------------------------------------------

    def exitStart(self, ctx: AssignmentStatementParser.StartContext):
        #self.print_tree(node=self.ast.root, level=1)
        # Draw the tree
        self.draw_tree(node=self.ast.root, x = 0, y = 0)
        tree = self.transform_binary_tree(self.ast.root)
        self.display_treeview(tree)
        
        # Show the plot
        #plt.axis('off')
        print("Bye")
        # Save the plot to a file
        plt.savefig('tree.png')
        print('tree.png')
        plt.show()

    def exitStatement(self, ctx: AssignmentStatementParser.StatementContext):
        ctx.value_attr = ctx.getChild(0).value_attr

    # Make a subtree for a given parsa tree node, tree node.
    def make_AST_subtree(self, tree_node, opertor):
        first_child = None
        brother = None
        no_children = tree_node.getChildCount()
        for i in range(0, no_children):
            next_child = tree_node.getChild(i)
            if(hasattr(next_child, 'value_attr')):
                print("i = ", i, "count = ", no_children, next_child.value_attr.value)
                if first_child == None:
                    first_child = next_child.value_attr
                if brother != None:
                    brother.value_attr.brother = next_child.value_attr
                brother = next_child
        sub_tree_pntr = self.ast.make_node(value=opertor, child=first_child, brother=None)
        tree_node.value_attr = sub_tree_pntr
        self.ast.root = sub_tree_pntr

    def exitIfst(self, ctx: AssignmentStatementParser.IfstContext):
        self.make_AST_subtree(tree_node = ctx, opertor = "if")

    def exitCond(self, ctx:AssignmentStatementParser.CondContext):
        self.make_AST_subtree(tree_node=ctx, opertor=">")

    def exitAssign(self, ctx: AssignmentStatementParser.AssignContext):
        idPntr = self.ast.make_node(value=ctx.ID().getText(), child=None, brother=ctx.expr().value_attr)
        assPntr = self.ast.make_node(value=":=", child=idPntr, brother=None)
        ctx.value_attr = assPntr
        self.ast.root = assPntr

    def exitCompoundst(self, ctx:AssignmentStatementParser.CompoundstContext):
        self.make_AST_subtree(tree_node = ctx, opertor = "block")

    def exitExpr_term_plus(self, ctx: AssignmentStatementParser.Expr_term_plusContext):
        self.make_AST_subtree(tree_node = ctx, opertor = "+")
       
    def exitExpr_term_minus(self, ctx: AssignmentStatementParser.Expr_term_plusContext):
        self.make_AST_subtree(tree_node= ctx, opertor = "-")

    def exitTerm4(self, ctx: AssignmentStatementParser.Term4Context):
        ctx.value_attr = ctx.term().value_attr

    def exitTerm_fact_mutiply(self, ctx: AssignmentStatementParser.Term_fact_mutiplyContext):
        self.make_AST_subtree(tree_node= ctx, opertor = "*")

    def exitTerm_fact_divide(self, ctx: AssignmentStatementParser.Term_fact_divideContext):
        self.make_AST_subtree(tree_node= ctx, opertor = "/")

    def exitFactor3(self, ctx: AssignmentStatementParser.Factor3Context):
        ctx.value_attr = ctx.factor().value_attr

    def exitFact_expr(self, ctx: AssignmentStatementParser.Fact_exprContext):
        ctx.value_attr = ctx.expr().value_attr

    def exitFact_id(self, ctx: AssignmentStatementParser.Fact_idContext):
        idPntr = self.ast.make_node(value=ctx.ID().getText(), child=None, brother=None)
        ctx.value_attr = idPntr

    def exitFact_number(self, ctx: AssignmentStatementParser.Fact_numberContext):
        ctx.value_attr = ctx.number().value_attr

    # ----------------------
    def exitNumber_float(self, ctx: AssignmentStatementParser.Number_floatContext):
        numberPntr = self.ast.make_node(value=ctx.FLOAT().getText(), child=None, brother=None)
        ctx.value_attr = numberPntr

    def exitNumber_int(self, ctx: AssignmentStatementParser.Number_intContext):
        numberPntr = self.ast.make_node(value=ctx.INT().getText(), child=None, brother=None)
        ctx.value_attr = numberPntr


class TreeNode:
    def __init__(self, value, child, brother):
        self.value = value
        self.child = child
        self.brother = brother

class AST:
    def __init__(self):
        self.root = None
        self.current = None

    def make_node(self, value, child, brother):
        tree_node = TreeNode(value, child, brother)
        self.current = tree_node
        return tree_node

    def add_child(self, node, new_child):
        if node.child is None:
            node.child = new_child
        else:
            self.current = node.child
            while self.current.brother is not None:
                self.current = self.current.brother
            self.current.brother = new_child
        self.current = new_child

    def add_brother(self, node, new_brother):
        if node.brother is None:
            node.brother = new_brother
        else:
            self.current = node.brother
            while self.current.brother is not None:
                self.current = self.current.brother
            self.current.brother = new_brother
        self.current = new_brother


