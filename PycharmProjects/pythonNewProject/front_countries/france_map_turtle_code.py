import turtle as france

# We move the pen
france.penup()
france.goto(20, 100)
france.pendown()

france.speed(10000)

x = 200
deg = 180
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

for i in range(x):
    france.forward(x)
    # We turn 180 deg
    france.left(deg)
    # We up the pen
    france.penup()
    # We come back at the same place
    france.forward(x)
    # We move the pen for 1 deg
    france.left(deg + 1)
    # We down the pen
    france.pendown()
    # We draw again
    france.forward(x)
    # And we turn again to 180
    france.left(deg)

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
