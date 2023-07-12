from tkinter import *
from PIL import ImageTk, Image

root = Tk()
root.title("Codemy.com Image Viewer")
root.iconbitmap("C:\\NetbeansProjectsWin\\PycharmProjects\\pythonNewProject\\images\\caisse2.png")

my_img1 = ImageTk.PhotoImage(Image.open("C:\\NetbeansProjectsWin\\PycharmProjects\\pythonNewProject\\images\\cloud.png"))
my_img2 = ImageTk.PhotoImage(Image.open("C:\\NetbeansProjectsWin\\PycharmProjects\\pythonNewProject\\images\\code_c.png"))
my_img3 = ImageTk.PhotoImage(Image.open("C:\\NetbeansProjectsWin\\PycharmProjects\\pythonNewProject\\images\\code_javascript.png"))
my_img4 = ImageTk.PhotoImage(Image.open("C:\\NetbeansProjectsWin\\PycharmProjects\\pythonNewProject\\images\\file.png"))
my_img5 = ImageTk.PhotoImage(Image.open("C:\\NetbeansProjectsWin\\PycharmProjects\\pythonNewProject\\images\\folder.png"))

my_label = Label(image=my_img1)
my_label.pack()

root.mainloop()