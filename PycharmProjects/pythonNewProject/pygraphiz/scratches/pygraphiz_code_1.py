import pygraphviz

G = pygraphviz.AGraph()

# We add a node
G.add_node("A", color="red")
G.add_edge("A", "B")
G.add_edge("b", "c")

# We can add node from a nodelist
node_list = ["f", "g", "h"]
G.add_node(node_list)

G.layout()
G.draw("pygraphvis.png")
