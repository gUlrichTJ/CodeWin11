import pygraphviz as pgv

G = pgv.AGraph()

# We create the nodes
G.add_node("1", color="red")
G.add_node("5", color="blue")
G.add_edge("1", "2", color="green")
G.add_edge("1", "3")
G.add_edge("2", "3")
