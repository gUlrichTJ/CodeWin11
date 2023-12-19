import turtle as t

window = t.Screen()
window.setup(width=180, height=400)
window.setworldcoordinates(-10, -10, 10, 100)

pen = t.Turtle()
pen.speed(3)
pen.shape("turtle")


def f(y):   # Definition of the function
    return y**2


pen.penup()
pen.goto(-10, 0)

for x in range(-10, 11):
    pen.goto(x, f(x))
    pen.pendown()

window.exitonclick()
