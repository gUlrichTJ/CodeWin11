import turtle as france

# We move the pen
france.penup()
france.goto(250, 300)
france.pendown()

print(france.width())
france.width(4)

france.speed(10000)


"""
# We draw
france.forward(x)
# We turn 180 deg
france.left(180)
# We up the pen
france.penup()
# We come back at the same place
france.forward(x)
# We move the pen for 1 deg
france.left(181)
# We down the pen
france.pendown()
# We draw again
france.forward(x)
# And we turn again to 180
france.left(180)
"""
x = 300
deg = n = 180
j = 0
color = ["rosybrown", "darkgoldenrod", "yellow", "greenyellow",
         "green", "purple", "orange", "cyan",
         "pink", "violet", "brown", "teal", "olive", "maroon",
         "gold", "navy", "indigo", "tomato", "steelblue", "black",
         "aquamarine", "coral", "darkslategray", "firebrick", "khaki",
         "lightcoral", "mediumseagreen", "peru", "rosybrown", "sienna", "black",
         "darkorchid", "dodgerblue", "indianred", "mediumaquamarine", "orangered",
         "palegreen", "slateblue", "springgreen", "turquoise", "darkcyan",
         "darkslateblue", "forestgreen", "darkmagenta", "crimson", "darkolivegreen",
         "chocolate", "darkseagreen", "dimgray", "dimgrey", "fuchsia",
         "green", "lightblue", "lightseagreen", "lightskyblue", "mediumblue",
         "mediumorchid", "mediumturquoise", "mediumvioletred", "midnightblue", "navajowhite",
         "olivedrab", "powderblue", "royalblue", "saddlebrown", "salmon",
         "seashell", "slategray", "tan", "thistle", "wheat",
         ]
"""
for i in range(int(n / 2)):
    if j == len(color) - 1:
        j = 0
    france.pencolor(color[j])
    france.begin_fill()
    # We draw
    france.forward(x)
    # We turn 180 deg
    france.left(deg)
    # We up the pen
    france.penup()
    # We come back at the same place
    france.forward(x)
    # We move the pen for 1 deg
    france.left(deg + 2)
    # We down the pen
    france.pendown()
    # We draw again
    france.forward(x)
    # And we turn again to 180
    france.left(deg)
    j += 1

# We move the pen
france.penup()
france.goto(300, 300)
france.pendown()
"""

"""
for i in range(int(n / 2)):
    if j == len(color) - 1:
        j = 0
    france.pencolor(color[j])
    france.begin_fill()
    # We draw
    france.forward(x)
    # We turn 180 deg
    france.left(deg)
    # We up the pen
    france.penup()
    # We come back at the same place
    france.forward(x)
    # We move the pen for 1 deg
    france.left(deg + 2)
    # We down the pen
    france.pendown()
    # We draw again
    france.forward(x)
    # And we turn again to 180
    france.left(deg)
    j += 1
"""

k = 0
xi = 300
yi = 300

while k < 5:
    france.penup()
    france.goto(xi, yi)
    france.pendown()

    for i in range(int(n / 2)):
        if j == len(color) - 1:
            j = 0
        france.pencolor(color[j])
        france.begin_fill()
        # We draw
        france.forward(x)
        # We turn 180 deg
        france.left(deg)
        # We up the pen
        france.penup()
        # We come back at the same place
        france.forward(x)
        # We move the pen for 1 deg
        france.left(deg + 2)
        # We down the pen
        france.pendown()
        # We draw again
        france.forward(x)
        # And we turn again to 180
        france.left(deg)
        j += 1

    k += 1
    xi -= 50
    yi -= 50

france.end_fill()

"""
i = 0
while i < 10:
    france.forward(i)
    france.right(i)
    i += 0.1
    pass

france.penup()
france.forward(30)
france.pendown()

for i in range(0, 400, 2):
    if i > 200:
        france.forward(i - 200)
        france.left(i)
    else:
        france.forward(i)
        france.left(i)
        france.forward(i)


#france.left(200)
#france.forward(200)

"""
france.mainloop()
