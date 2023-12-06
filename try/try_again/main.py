# TODO: The dictionaries
birthday = {
   'Mummy': '14 aug', 
   'Daddy': '12 oct',
   'Graciela': '9 apr',
   'Me': '22 jan',
   'Gadiela': '31 may'
   }

# TODO: The use of range
print(range(-10, 11))

# Let's sort the list
s = "lambda"
l = list(s)
print(l)
l.sort()
print(l)
print(l.count("a"))

# TODO: Insertion
l.insert(0, "i")
l.insert(1, "s")
l.insert(2, "e")
l.insert(3, "r")
l.insert(4, "t")
l.insert(5, "i")
l.insert(6, "o")
l.insert(7, "n")

print(l.index('a'))

print(l)

# Remove from a list
l.remove("a")
l.remove(l[3])

print(l)
