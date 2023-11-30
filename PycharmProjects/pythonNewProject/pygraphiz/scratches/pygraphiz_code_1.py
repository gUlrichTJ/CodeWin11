import pygraphviz

G = pygraphviz.AGraph()

# We add a node
G.add_node("a", color="red")
G.add_edge("b", "c")

# We can add node from a nodelist
node_list = ["f", "g", "h"]
G.add_node(node_list)

