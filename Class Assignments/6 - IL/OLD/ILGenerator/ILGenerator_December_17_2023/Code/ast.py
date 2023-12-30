
class BinaryAST:
    def __init__(self):
        self.root = None

    class TreeNode:
        def __init__(self, value, child, brother):
            self.value = value
            self.child = child
            self.brother = brother

    def make_node(self, value, child, brother):
        tree_node = self.TreeNode(value, child, brother)
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


    def get_node_childern(self,node):
        if node.child is None:
            return []
        children = []
        current_child = node.child
        while current_child is not None:
            children.append(current_child)
            current_child = current_child.brother
        return children


class AST:
    def __init__(self):
        self.root = None
        self.current_number = 0

    class TreeNode:
        def __init__(self, value, children,number):
            self.value = value
            self.children = children
            self.number = number

    def make_node(self, value, children):
        tree_node = self.TreeNode(value, children,self.current_number)
        self.current_number += 1
        return tree_node

    def add_child(self, node, new_child):
        if node.children is None:
            node.children = [].append(new_child)
        else:
            node.children.append(new_child)


def transform_binary_ast_to_normal_ast(ast):
    normal_ast = AST()
    normal_ast.root = normal_ast.make_node(ast.root.value, [])
    normal_ast.root = binary_to_normal(ast.root, normal_ast.root, normal_ast,ast)
    return normal_ast


def binary_to_normal(binary_ast_node, normal_ast_node, normal_ast, binary_ast):
    binary_ast_node_children = binary_ast.get_node_childern(binary_ast_node)
    if binary_ast_node_children is None:
        return None
    for binary_ast_node_child in binary_ast_node_children:
        child = normal_ast.make_node(binary_ast_node_child.value, [])
        normal_ast.add_child(normal_ast_node, binary_to_normal(binary_ast_node_child, child, normal_ast, binary_ast))
    return normal_ast_node
