import turtle as village

# TODO : The title of our window
village.title("We draw villages")

# TODO : The place where the turtle will start
# Merci Pere
village.penup()
village.goto(0, 90)
village.pendown()

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
village.fillcolor("mediumvioletred")
village.end_fill()

village.left(30)

# TODO: We turn to draw the second village
village.begin_fill()
village.forward(village_size)
village.left(90)
village.forward(village_size / 2)
village.left(90)
village.forward(village_size)
village.fillcolor("purple")
village.end_fill()

# TODO: We draw the third village
village.begin_fill()
village.right(90)
village.forward(village_size / 2)
village.right(90)
village.forward(village_size)
village.right(90)
village.forward(village_size / 2)
village.fillcolor("indigo")
village.end_fill()

# We move to the end of the second village
village.forward(village_size / 2)

# TODO: We draw the rest of the villages
# TODO: We put the colors in a table
colors = ["mediumvioletred", "yellow", "purple"]
colours = ["indigo", "mediumvioletred", "yellow"]

for i in range(3):
    # TODO: We turn to draw the second village
    village.begin_fill()
    village.left(90)
    village.forward(village_size)
    village.left(90)
    village.forward(village_size / 2)
    village.left(90)
    village.forward(village_size)
    village.fillcolor(colors[i])
    village.end_fill()

    # TODO: We draw the third village
    village.begin_fill()
    village.right(90)
    village.forward(village_size / 2)
    village.right(90)
    village.forward(village_size)
    village.right(90)
    village.forward(village_size / 2)
    village.fillcolor(colours[i])
    village.end_fill()

    # We move to the end of the second village
    village.forward(village_size / 2)

# TODO: We draw the last village
village.begin_fill()

village.left(30)
village.forward(village_size)

village.left(160)
village.forward(village_size)

village.right(10)

# We draw the fire of the rocket
village.right(90)
village.forward(village_size / 2)
village.left(90)

village.forward(village_size * 0.75)

village.left(90)
village.forward(village_size / 2)

village.right(105)
village.forward(village_size)

village.left(160)
village.forward(village_size)

village.fillcolor("purple")
village.end_fill()

village.hideturtle()

village.mainloop()
