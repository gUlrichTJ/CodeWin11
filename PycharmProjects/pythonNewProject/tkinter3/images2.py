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

image_list = [my_img1, my_img2, my_img3, my_img4, my_img5]

image_list[2]

my_label = Label(image=my_img1)
my_label.grid(row=0, column=0, columnspan=3)

button_back = Button(root, text="<<")
button_exit = Button(root, text="EXIT PROGRAM", command=root.quit)
button_forward = Button(root, text=">>")

button_back.grid(row=1, column=0)
button_exit.grid(row=1, column=1)
button_forward.grid(row=1, column=2)

root.mainloop()