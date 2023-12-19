# We are going to try to show out the integers
# smaller than n that verify the equation x^2 + y^2 = z^2
def returnNumbers(n, max_n):
    i = 0
    for x in range(1, max_n):
        for y in range(1, max_n):
            for z in range(1, max_n):
                if x**n + y**n == z**n:
                    i += 1
                    print(x, y, z)
    print(i)


# Now, we try it with n = 100
returnNumbers(2, 200)
