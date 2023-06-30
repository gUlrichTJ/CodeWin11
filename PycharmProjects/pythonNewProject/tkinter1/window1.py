from tkinter import *

root = Tk()

# Creationg a label widget
myLabel = Label(root, text="Hello World !").grid(row=0, column=2)
myLabel1 = Label(root, text="My name is John Doe")
myLabel2 = Label(root, text="My name is Jakarta-EE")

# Showing it into the screen
# myLabel.grid(row=0, column=0)
myLabel1.grid(row=5, column=10)
myLabel2.grid(row=2, column=2)

root.mainloop()
