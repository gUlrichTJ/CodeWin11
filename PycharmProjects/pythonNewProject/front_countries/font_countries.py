import turtle
import turtle as village

# TODO : The title of our window
village.title("We draw villages")

# TODO: The size of villages
village_size = 100

village.speed(5)
village.begin_fill()
village.forward(village_size)
village.left(120)
village.forward(village_size)
village.left(120)
village.forward(village_size)

# TODO: We fill the first village
village.fillcolor("red")
village.end_fill()

# TODO: We turn to draw the second village
village.begin_fill()
village.left(30)
village.forward(village_size)
village.left(90)
village.forward(village_size / 2)
village.left(90)
village.forward(village_size)
village.fillcolor("grey")
village.end_fill()

# TODO: We draw the third village
village.begin_fill()
village.right(90)
village.forward(village_size / 2)
village.right(90)
village.forward(village_size)
village.right(90)
village.forward(village_size / 2)
village.fillcolor("pink")
village.end_fill()

# We move to the end of the second village
village.forward(village_size / 2)

# TODO: We draw the rest of the villages
# TODO: We put the colors in a table
colors = ["black", "purple", "orange", "blue", "green", "brown"]

for i in range(3):
    # TODO: We turn to draw the second village
    village.begin_fill()
    village.left(90)
    village.forward(village_size)
    village.left(90)
    village.forward(village_size / 2)
    village.left(90)
    village.forward(village_size)
    village.end_fill()

    # TODO: We draw the third village
    village.begin_fill()
    village.right(90)
    village.forward(village_size / 2)
    village.right(90)
    village.forward(village_size)
    village.right(90)
    village.forward(village_size / 2)
    village.fillcolor(colors[i])
    village.end_fill()

    # We move to the end of the second village
    village.forward(village_size / 2)

# We draw the last village
village.left(30)
village.forward(village_size)

village.left(160)
village.forward(village_size)

village.right(10)
village.forward(village_size / 2)

village.right(10)
village.forward(village_size)

village.mainloop()
