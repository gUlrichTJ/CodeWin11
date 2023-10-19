# Dictionaries
import pprint

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
