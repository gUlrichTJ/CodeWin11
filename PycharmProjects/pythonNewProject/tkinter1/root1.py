from tkinter import *

root = Tk()

# Creationg a label widget
myLabel = Label(root, text="Hello World !")
myLabel1 = Label(root, text="My name is John Doe")

# Showing it into the screen
myLabel.grid(row=0, column=0)
myLabel1.grid(row=1, column=0)

root.mainloop()