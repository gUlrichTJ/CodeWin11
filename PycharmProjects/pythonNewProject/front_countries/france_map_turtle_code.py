import turtle as france

# We move the pen
france.penup()
france.goto(20, 100)
france.pendown()

france.speed(1)

i = 0
while i < 250:
    france.forward(i)
    france.right(i)
    i += 0.1
    pass

france.penup()
france.forward(300)
france.pendown()

for i in range(100):
    france.forward(i)
    france.left(i)


#france.left(200)
#france.forward(200)

france.mainloop()
