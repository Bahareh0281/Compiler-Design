from antlr4 import *
from matplotlib import pyplot as plt

from Code.ILMapper import ILMapper
from Code.ast_to_networkx_graph import transform_ast_to_networkx
from Gen.AssignmentStatementLexer import AssignmentStatementLexer
from Gen.AssignmentStatementParser import AssignmentStatementParser
from Code.CustomASTListener import ASTListener
from Code.ast import transform_binary_ast_to_normal_ast
import networkx as nx

import argparse

def main(args):
    # Step 1: Load input source into stream
    stream = FileStream(args.file, encoding='utf8')
    print('Input language_apps:\n{0}'.format(stream))
    print('Result:')

    # Step 2: Create an instance of AssignmentStLexer
    lexer = AssignmentStatementLexer(stream)
    # Step 3: Convert the input source into a list of tokens
    token_stream = CommonTokenStream(lexer)
    # Step 4: Create an instance of the AssignmentStParser
    parser = AssignmentStatementParser(token_stream)
    # Step 5: Create parse tree
    parse_tree = parser.start()
    # Step 6: Create an instance of AssignmentStListener
    ast_generator = ASTListener()
    # Step 7(a): Walk parse tree with a customized listener (Automatically)
    walker = ParseTreeWalker()
    walker.walk(t=parse_tree, listener=ast_generator)
    normal_ast = transform_binary_ast_to_normal_ast(ast_generator.ast)

    plt.close()
    graph = transform_ast_to_networkx(normal_ast.root)
    options = {
        "font_size": 12,
        "node_size": 500,
        "node_color": "white",
        "edgecolors": "black",
        "linewidths": 1,
        "width": 1,
    }
    # nx.draw_networkx(graph,with_labels=True, pos=None,labels=nx.get_node_attributes(graph, "label"), **options)

    # if you can't install pygraphviz uncomment previous line and comment the next three
    # from networkx.drawing.nx_agraph import graphviz_layout
    # pos = graphviz_layout(graph, prog="dot")
    # nx.draw(graph, pos, node_size=500, labels=nx.get_node_attributes(graph, "label"), alpha=0.5, node_color="cyan", with_labels=True)

    import pydot
    from networkx.drawing.nx_pydot import graphviz_layout
    pos = graphviz_layout(graph, prog="dot")
    nx.draw(graph, pos, node_size=500, labels=nx.get_node_attributes(graph, "label"), alpha=0.5, node_color="cyan", with_labels=True)
    # Set margins for the axes so that nodes aren't clipped
    ax = plt.gca()
    ax.margins(0.20)
    plt.axis("off")
    plt.show()
    s = 0  # choose a source node
    post_order_traversal =[]
    for node in nx.dfs_postorder_nodes(graph, source=s):  # iterate over nodes in postorder
        label = graph.nodes[node].get('label', 'No label')
        post_order_traversal.append(label) # display the node
    print("\n Finished")
    print(post_order_traversal)
    il_mapper = ILMapper()
    print(il_mapper.generate_intermediate_language(post_order_traversal))

if __name__ == '__main__':
    argparser = argparse.ArgumentParser()
    argparser.add_argument(
        '-n', '--file',
        help='Input source', default=r'input2.txt')
    args = argparser.parse_args()
    main(args)
