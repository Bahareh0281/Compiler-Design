from antlr4 import *

class JavaLikeListener(ParseTreeListener):

    def __init__(self):
        self.complexity = 0
        self.node_count = 0

    def enterEveryRule(self, ctx):
        self.node_count += 1

    def exitClassDef(self, ctx):
        rootNode = ctx.getChild(0)
        # Calculate height (H)
        self.complexity += self.calculateHeight(rootNode)
        # Calculate Twin number (Rt)
        self.complexity += self.calculateTwinCount(rootNode)
        # Calculate Monadicity (M)
        self.complexity += self.calculateMonadicity(rootNode)

    def calculateHeight(self, node):
        if isinstance(node, TerminalNode):
            return 0
        else:
            max_height = 0
            for child in node.children:
                height = self.calculateHeight(child)
                max_height = max(max_height, height + 1)
            return max_height

    def calculateTwinCount(self, node):
        if isinstance(node, TerminalNode):
            return 0
        else:
            return sum(1 for child in node.children if isinstance(child, RuleNode))

    def calculateMonadicity(self, node):
        if isinstance(node, TerminalNode):
            return 1
        else:
            return 0 if any(child for child in node.children if isinstance(child, RuleNode)) else 1

    def getComplexity(self):
        # Calculate Sc after parsing is complete
        self.complexity += self.node_count - 1
        return self.complexity