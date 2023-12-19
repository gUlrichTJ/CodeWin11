# We are going to try to show out the integers
# smaller than n that verify the equation x^2 + y^2 = z^2
def returnNumbers(maximum_number):
    for x in range(1, maximum_number):
        for y in range(1, maximum_number):
            for z in range(1, maximum_number):
                if x**maximum_number + y**maximum_number == z**maximum_number:
                    print(x, y, z)


# Now, we try it with n = 100
returnNumbers(100)
