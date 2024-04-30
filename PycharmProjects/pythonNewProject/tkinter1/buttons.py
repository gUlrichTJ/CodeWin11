#
# from tkinter import *
#
# root = Tk()
#
#
# def my_click():  # The function
#     my_label = Label(root, text="Look ! I clicked a button !!", font=("Comic Sans MS", 12))
#     my_label.pack()
#
#
# myButton = Button(root, text="Click me !", command=my_click, foreground="lightblue", background="black",
#                   padx=20, pady=10)
#
# myButton.pack()
#
# root.mainloop()
from tkinter import *

root = Tk()


def onclick():  # We create a function that will print the text
    my_label = Label(root, text="The button is clicked", font=("Comic Sans MS", 13), background="cyan")
    my_label.pack()


my_button = Button(root, text="Click me!", foreground="red", background="lightgray", pady=10, padx=20,
                   command=onclick)

my_button.pack()

root.mainloop()
