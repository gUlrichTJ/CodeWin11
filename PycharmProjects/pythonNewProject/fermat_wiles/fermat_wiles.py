import time as t


# We are going to try to show out the integers
# smaller than n that verify the equation x^2 + y^2 = z^2
def returnNumbers(n, max_n):
    """We initialize the time"""
    start_time = t.time()

    temp = list()
    for x in range(1, max_n):
        for y in range(x, max_n):
            if y in temp[:]:
                continue
            for z in range(1, max_n):
                if x**n + y**n == z**n:
                    temp.append(x)
                    print(x, y, z)

    print(len(temp) * 2)
    end_time = t.time()

    execution_time = end_time - start_time
    print(execution_time)
# execution_time = timeit.timeit(returnNumbers(2, 100), number=1)


# Now, we try it with n = 100
returnNumbers(2, 300)
