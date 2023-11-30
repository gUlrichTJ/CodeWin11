import turtle as france

# We move the pen
france.penup()
france.goto(20, 100)
france.pendown()

i = 0
while i < 200:
    france.forward(i)
    france.left(i)
    pass

france.left(200)
france.forward(200)

france.mainloop()
