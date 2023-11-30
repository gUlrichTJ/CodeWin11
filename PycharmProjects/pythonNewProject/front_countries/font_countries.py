import turtle as village

# TODO : The title of our window
village.title("We draw villages")

village.speed(2)
village.begin_fill()
village.forward(200)
village.left(120)
village.forward(200)
village.left(120)
village.forward(200)

# TODO: We fill the first village
village.fillcolor("red")
village.end_fill()

# TODO: We turn to draw the second village
village.left(30)
village.forward(200)

village.mainloop()
