from tkinter import *
from PIL import ImageTk, Image
root = Tk()
root.title("Learn to code with codemy.com")
root.iconbitmap("C:\\NetbeansProjectsWin\\PycharmProjects\\pythonNewProject\\images\\caisse2.png")

my_img = ImageTk.PhotoImage(Image.open("C:\\NetbeansProjectsWin\\PycharmProjects\\pythonNewProject\\images\\caisse2.png"))
my_label = Label(image=my_img)
my_label.pack()

button_quit = Button(root, text="Exit Program", command=root.quit)
button_quit.pack()

root.mainloop()
