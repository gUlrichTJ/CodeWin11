import turtle as france

# We move the pen
france.penup()
france.goto(20, 100)
france.pendown()

france.speed(40)

i = 0
while i < 300:
    france.forward(i + 1)
    france.right(i)
    i += 1
    pass

france.left(200)
#france.forward(200)

france.mainloop()
