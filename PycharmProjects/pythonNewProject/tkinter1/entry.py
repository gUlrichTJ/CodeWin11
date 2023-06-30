from tkinter import *

root = Tk()

e = Entry(root)
e.pack()
e.insert(0, "Enter your name : ")

# We define the function
def onclick():
    label = Label(root, text=e.get(), font=("Serif", 12))
    label.pack()

button = Button(root, text="What did he write ?", foreground="red", background="lightgray",
                command=onclick, font=("Verdana", 11))

button.pack()


root.mainloop()
