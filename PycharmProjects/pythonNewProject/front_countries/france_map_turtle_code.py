import turtle as france

# We move the pen
france.penup()
france.goto(20, 100)
france.pendown()

france.speed(10000)

x = 100
france.forward(x)
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
