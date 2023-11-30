import turtle as village

# TODO : The title of our window
village.title("We draw villages")

# TODO: The size of villages
village_size = 100

village.speed(2)
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

village.mainloop()
