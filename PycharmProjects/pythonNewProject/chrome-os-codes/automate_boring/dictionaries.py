# Dictionaries
import pprint

# We create a function to take the number of lines or columns


def dimension(label):
    lines = input(f"Number of {str(label)} : ")
    while True:
        if not lines.isdigit():
            lines = input("You must enter a number : ")
        else:
            break

    return int(lines)


def second(table):
    lines = dimension("lines")  # We receive the number of lines
    columns = dimension("columns")  # We receive the number of columns

    for i in range(lines):  # We iterate
        for j in range(columns):
            table[i][j] = input(f"Name[{i}][{j}] : ")   # We receive datas

    display(table, lines, columns)

    return table    # We return the table


def display(table, lines, columns):
    for i in range(lines):
        for j in range(columns):
            print(f"{table[i][j]:>20}", end=" ")
        print()


two_dim_table = [[None] * 10 for i in range(10)]
second(two_dim_table)


def string_store(table, n, c):  # We're going to store string in a table
    print()
    while True:
        lines = input("Lines : ")
        while not lines.isdigit():  # We verify the number of lines entered is a digit
            print("The number of lines must be a digit.\nLines : ", end="")
            lines = input()
        columns = input("Columns : ")
        while not lines.isdigit():
            print("The number of columns must be a digit.\nColumns : ", end="")
            columns = input()


# We're going to enter datas in a table of two dimensions

def two_dim_table(table, l, c):
    # We enter datas
    for i in range(l):
        for j in range(c):
            print(f"Enter value [{i+1}][{j+1}] : ")
            data = input()
            while not data.isdigit():
                print("You must enter an integer ", end=" ")
                data = input()

            table[i][j] = data

    print()
    for i in range(l):
        for j in range(c):
            print(f"{table[i][j]:>15}", end=" ")
        print()
        if i < l - 1:
            print("|", end="")


# We create a table were we put the integers
tab = [[0 for i in range(10)] for j in range(10)]
two_dim_table(tab, l=5, c=4)
print()
# strip and ...
message = "Éloignez o Seigneur Jesus, les attractions de ce monde   ."
message.strip()
print(message)

# We take the age and the password
while True:
    a = input("Enter you age (numbers only) : ")
    if a.isdigit():
        break
    print("It must be a number.".ljust(20))

while True:
    a = input("Enter a password (letters and numbers) : ")
    if a.isalnum():
        break
    print("It must be letters and numbers.".rjust(20, "*"))

print('This is carol\\\'s pen.')
print(r'This is carol\'s pen')
print('''
    Hello. I'm Graciano.
    I like mathematics.
    I'm fond of reading bible.
    I have friends.
    I'm the best programmer in The Wold.
''')
# Let's count the number of characters in a string
message = "Lorem ipsum dolor and the day is good for you and your family"
counter = 0

# Let's count
for i in message:
    if i.isalpha():
        counter += 1

print(counter, " letters.")

dico = {
    'name': 'Winner',
    'firstname': 'Awouno',
    'age': 20,
    'profession': 'developer',
    'hobbies': 'code',
    'n PC': 2
}

pprint.pprint(dico)
