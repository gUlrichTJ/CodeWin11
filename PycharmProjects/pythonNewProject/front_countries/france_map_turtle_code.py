import turtle as france

# We move the pen
france.penup()
france.goto(20, 100)
france.pendown()

france.speed(10000)

i = 0
while i < 10:
    france.forward(i)
    france.right(i)
    i += 0.1
    pass

france.penup()
france.forward(30)
france.pendown()

for i in range(0, 200, 2):
    france.forward(i - i / 2)
    france.left(i)
    france.forward(i)


#france.left(200)
#france.forward(200)

france.mainloop()
