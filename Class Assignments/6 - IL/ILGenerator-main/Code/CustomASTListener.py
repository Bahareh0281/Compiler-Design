import queue
import networkx as nx
import matplotlib.pyplot as plt
from tkinter import ttk
import tkinter as tk

from Gen.AssignmentStatementListener import AssignmentStatementListener
from Gen.AssignmentStatementParser import AssignmentStatementParser
from Code.ast import BinaryAST as AST


class ASTListener(AssignmentStatementListener):
    def __init__(self):
        self.ast = AST()  # Data structure for holding the abstract syntax tree
        self.q = queue.Queue()  # Use to print and visualize InClassPresentation
        self.g = nx.DiGraph()  # Use to visualize InClassPresentation
        self.max_x = 0
        self.scoped_operators = ['if','for','while','block']

    # -------------------------------------------------------
    def draw_tree(self, node, x, y):
        if node is None:
            return
        # Draw the node
        if x < self.max_x:
            x = self.max_x
        plt.plot(x, y, "o", markersize=15, color="cyan")
        plt.text(x, y, str(node.value), ha="center", va="center")
        print("x = ", x, "max_x ", self.max_x, " y = ", y, " nd: ", node.value)
        if node.brother is not None:
            print("brother of ", node.value, " is", node.brother.value)
        if node.child is not None:
            print("child of ", node.value, " is", node.child.value)

        # Draw the vertical line to the first child
        if node.child is not None:
            plt.plot([x, x], [y - 0.1, y - 1], "k-", linewidth=2, color="red")
            self.draw_tree(node.child, x, y - 1)

        # Draw the horizontal line to the first brother
        if node.brother is not None:
            plt.plot([x + 0.1, self.max_x + 1], [y, y], "k-", linewidth=2, color="red")
            print("----x is :", x, "self.max_x ", self.max_x)
            self.max_x += 1
            self.draw_tree(node.brother, x + 1, y)

    def transform_binary_tree(self, root):
        if root is None:
            return None

        tree = ttk.Treeview()
        nodes = {}

        def traverse(node, parent, iid=None):
            if node is None:
                return

            node_id = len(nodes)
            nodes[node_id] = node

            if parent is None:
                iid = tree.insert("", "end", text=str(node.value))
            else:
                iid = tree.insert(parent, "end", text=str(node.value))

            traverse(node.child, iid)
            traverse(node.brother, parent)

        traverse(root, None)
        return tree

    def display_treeview(self, tree):
        tree.pack()
        tk.mainloop()

    # -------------------------------------------------------

    def exitStart(self, ctx: AssignmentStatementParser.StartContext):
        # self.print_tree(node=self.ast.root, level=1)
        # Draw the tree
        self.draw_tree(node=self.ast.root, x=0, y=0)
        tree = self.transform_binary_tree(self.ast.root)
        #self.display_treeview(tree)

        # Show the plot
        # plt.axis('off')
        print("Bye")
        # Save the plot to a file
        plt.savefig("tree.png")
        print("tree.png")
        plt.show()

    def exitStatement(self, ctx: AssignmentStatementParser.StatementContext):
        ctx.value_attr = ctx.getChild(0).value_attr

    # Make a subtree for a given parsa tree node, tree node.
    def make_AST_subtree(self, tree_node, operator):
        first_child = None
        brother = None
        number_of_children = tree_node.getChildCount()
        for i in range(0, number_of_children):
            next_child = tree_node.getChild(i)
            if hasattr(next_child, "value_attr"):
                print("i = ", i, "count = ", number_of_children, next_child.value_attr.value)
                if first_child is None:
                    first_child = next_child.value_attr
                if brother is not None:
                    brother.value_attr.brother = next_child.value_attr
                brother = next_child

        if operator in self.scoped_operators:
            first_child = self.ast.make_node("begin", child=None, brother=first_child)
            brother.value_attr.brother = self.ast.make_node(value="end", child=None, brother=None)
        sub_tree_pntr = self.ast.make_node(
            value=operator, child=first_child, brother=None
        )
        tree_node.value_attr = sub_tree_pntr
        self.ast.root = sub_tree_pntr

    def exitIfst(self, ctx: AssignmentStatementParser.IfstContext):
        self.make_AST_subtree(tree_node=ctx, operator="if")

    def exitForst(self, ctx: AssignmentStatementParser.ForstContext):
        self.make_AST_subtree(tree_node=ctx, operator="for")

    def exitWhilest(self, ctx: AssignmentStatementParser.WhilestContext):
        self.make_AST_subtree(tree_node=ctx, operator="while")

    def exitSwitchst(self, ctx: AssignmentStatementParser.SwitchstContext):
        self.make_AST_subtree(tree_node=ctx, operator="switch")

    def exitCase(self, ctx: AssignmentStatementParser.CaseContext):
        self.make_AST_subtree(tree_node=ctx, operator="case")

    def exitCond(self, ctx: AssignmentStatementParser.CondContext):
        operator = ctx.getChild(1).getText()  # Get the actual operator from the context
        self.make_AST_subtree(tree_node=ctx, operator=operator)

    def exitAssign(self, ctx: AssignmentStatementParser.AssignContext):
        if hasattr(ctx.expr(), "value_attr"):
            idPntr = self.ast.make_node(
                value=ctx.ID().getText(), child=None, brother=ctx.expr().value_attr
            )
        else:
            idPntr = self.ast.make_node(
                value=ctx.ID().getText(), child=None, brother=ctx.ternary().value_attr
            )
        assPntr = self.ast.make_node(value="=", child=idPntr, brother=None)
        ctx.value_attr = assPntr
        self.ast.root = assPntr

    def exitTernary(self, ctx: AssignmentStatementParser.TernaryContext):
        self.make_AST_subtree(tree_node=ctx, operator="?")

    def exitCompoundst(self, ctx: AssignmentStatementParser.CompoundstContext):
        self.make_AST_subtree(tree_node=ctx, operator="block")

    def exitExpr_term_plus(self, ctx: AssignmentStatementParser.Expr_term_plusContext):
        self.make_AST_subtree(tree_node=ctx, operator="+")

    def exitExpr_term_minus(self, ctx: AssignmentStatementParser.Expr_term_plusContext):
        self.make_AST_subtree(tree_node=ctx, operator="-")

    def exitTerm4(self, ctx: AssignmentStatementParser.Term4Context):
        ctx.value_attr = ctx.term().value_attr

    def exitTerm_fact_mutiply(
        self, ctx: AssignmentStatementParser.Term_fact_mutiplyContext
    ):
        self.make_AST_subtree(tree_node=ctx, operator="*")

    def exitTerm_fact_divide(
        self, ctx: AssignmentStatementParser.Term_fact_divideContext
    ):
        self.make_AST_subtree(tree_node=ctx, operator="/")

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
        numberPntr = self.ast.make_node(
            value=ctx.FLOAT().getText(), child=None, brother=None
        )
        ctx.value_attr = numberPntr

    def exitNumber_int(self, ctx: AssignmentStatementParser.Number_intContext):
        numberPntr = self.ast.make_node(
            value=ctx.INT().getText(), child=None, brother=None
        )
        ctx.value_attr = numberPntr

