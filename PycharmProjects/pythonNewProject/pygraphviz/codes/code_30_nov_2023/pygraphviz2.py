import pygraphviz as pgv

G = pgv.AGraph(directed=True, strict=True)

# We create the nodes
G.add_node("1", color="red")
G.add_node("5", color="blue")
G.add_edge("1", "2", color="green")
G.add_edge("1", "3")
G.add_edge("2", "3")
G.add_edge("3", "5")
G.add_edge("2", "4")
G.add_edge("2", "6")
G.add_edge("4", "6")

G.layout()
G.draw("../../images/oriented.png")
