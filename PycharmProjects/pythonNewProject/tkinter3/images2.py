from tkinter import *
from PIL import ImageTk, Image

root = Tk()
root.title("Codemy.com Image Viewer")
root.iconbitmap("C:\\NetbeansProjectsWin\\PycharmProjects\\pythonNewProject\\images\\caisse2.png")

my_img1 = ImageTk.PhotoImage(Image.open("C:\NetbeansProjectsWin\PycharmProjects\pythonNewProject\images\cloud.png"))
my_img2 = ImageTk.PhotoImage(Image.open("C:\NetbeansProjectsWin\PycharmProjects\pythonNewProject\images\code_c.png"))

root.mainloop()