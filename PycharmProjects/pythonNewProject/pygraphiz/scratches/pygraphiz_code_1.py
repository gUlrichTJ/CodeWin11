import pygraphviz

G = pygraphviz.AGraph()

# We add a node
G.add_node("A", color="red")
G.add_edge("A", "B")
G.add_edge("A", "H")
G.add_edge("H", "I", color="blue")
G.add_edge("I", "J")
G.add_edge("J", "H")
G.add_edge("B", "C")
G.add_edge("C", "D")
G.add_edge("C", "E")
G.add_edge("E", "G")
G.add_edge("G", "F")
G.add_edge("F", "E")
G.add_edge("b", "c")

# We can add node from a nodelist


node_list = ["f", "g", "h"]
G.add_node(node_list)

G.layout()
G.draw("pygraphvis.png")

A = pygraphviz.AGraph(directed=True, strict=True, rankdir="LR")
# add node 1 with color red
A.add_node(1, color="red")
A.add_node(5, color="blue")
# add some edges
A.add_edge(1, 2, color="green")
A.add_edge(2, 3)
A.add_edge(1, 3)
A.add_edge(3, 4)
A.add_edge(3, 5)
A.add_edge(3, 6)
A.add_edge(4, 6)
# adjust a graph parameter
A.graph_attr["epsilon"] = "0.001"
print(A.string()) # print dot file to standard output
A.layout("dot") # layout with dot
A.draw("foo.png") # write to file
