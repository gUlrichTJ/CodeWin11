import random
import turtle as france
import colorsys

# We move the pen
france.penup()
france.goto(250, 300)
france.pendown()

print(france.width())
france.width(4)

france.speed(10000000000)

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
tabXi = [-300, 200, -350, -350, -450, 75, -100, -400]
tabYi = [-300, 100, 300, -75, 400, 25, -300, -400]
tabN = [170, 120, 179, 360, 270, 100, 80, 23, 10]

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

k = 0
xi = 300
yi = 300

# Function to convert RGB to valid color


def rgb_to_turtle_color(rgb):
    return "#{:02x}{:02x}{:02x}".format(rgb[0], rgb[1], rgb[2])


while k < 7:
    france.penup()
    france.goto(xi, yi)
    france.pendown()

    for i in range(int(n / 2)):
        if j == len(color) - 1:
            j = 0
        # france.pencolor(color[j])
        random_color = (random.randint(250, 255), random.randint(250, 255), random.randint(250, 255))

        france.pencolor(rgb_to_turtle_color(random_color))
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
    xi = tabXi[k]
    yi = tabYi[k]
    n = tabN[k]

france.end_fill()

france.mainloop()
