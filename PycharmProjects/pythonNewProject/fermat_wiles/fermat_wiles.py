import math
import time as t


# We are going to try to show out the integers
# smaller than n that verify the equation x^2 + y^2 = z^2
# I love my family forever.
def returnNumbers(n, max_n):
    """We initialize the time"""
    start_time = t.time()

    temp = list()
    for x in range(1, max_n):
        for y in range(x, max_n):
            if y in temp[:] or x > y:
                continue
            for z in range(1, max_n):
                if x**n + y**n == z**n:
                    temp.append(x)
                    print(x, y, z)

    # We print the number of equations that verify function
    print(len(temp) * 2)
    end_time = t.time()

    execution_time = end_time - start_time
    print(execution_time)
# execution_time = timeit.timeit(returnNumbers(2, 100), number=1)


# Now, we try it with n = 300
# returnNumbers(2, 300)
# We test something
produit = 1
for i in range(1, 9):
    produit *= i

print(produit)


def factorielle(n):
    _produit = 0
    if n == 0 or n == 1:
        return 1
    else:
        pass
    return _produit


print(factorielle(4))
print(math.factorial(3))
