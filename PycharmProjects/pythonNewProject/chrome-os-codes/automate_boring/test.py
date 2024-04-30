# import random

# list

# Here, we record the names in a list
names_list = ['', '', '', '', '', '', '', '', '', '', '']

# We take the number of names
while True:
    try:
        number_of_names = int(input("How many names do you want to enter ? "))
        if number_of_names < 0 or number_of_names > 10:
            print("The number must be between 0 and 10. Try again.")
        else:
            print("Correct entry")
            break
    except ValueError:
        print("You must enter an integer.")

# We enter the names in a list
for i in range(number_of_names):
    name = str(input("Enter name "))
    names_list[i] = name


names_list.sort(reverse=True)
# We display the names
print("\nNames entered\n")
for i in range(number_of_names):
    print(names_list[i], end=' ')

# We verify if the name entered is in the list
print("\nEnter a name ")
name = input()
if name not in names_list:
    print(name, " is not in the list\n")
else:
    print(name, " is in the list.")

list1 = ['bat', 'now', 'and', 'chemistry', 'mathematics']
list2 = [['bat', 1, ['hello', 'mummy'], 'nope'], 'mum', [8, 7, 6], 9]

print(list1)
print("Printing with a loop")
print()
for i in range(len(list1)):
    print(list1[i], end=' ')


# Let's iterate the list2
for item in list2:
    print(item, end=" ")
# Division error
# A random number


"""
def random_number():
    random_number1 = random.randint(1, 10)

    i = 0
    while i < 10:
        users_number = int(input("What's the random number ? "))
        i += 1
        if i == 9:
            print("Time over! The random number is ", random_number1)
        if users_number < random_number1:
            print("Too low")
        elif users_number > random_number1:
            print("Too high")
        else:
            print("You found the random number. Congratulations")
            break


print()
random_number()


def division(a1, b1):
    try:
        c = a1 / b1
        print(a1, "/", b1, " = ", c)
    except ZeroDivisionError:
        print("You try to divide by ", b1)


division(2, 0)

# A random number
a = random.randint(70, 75)

b = int(input('What is the random number between 70 and 75 ? '))

if a == b:
    print("You found the random number.")
else:
    print("False! The random number was ", a)


print()


def hi():
    for i in range(1, 400, 13):
        print('Hello', i, end=" ")


hi()
"""