def starFormation3(n):
    i = 1
    j = "*"
    while (i < (n-3)):
        print(i * j)
        i = i + 1
    while (i > 0):
        print(i * j)
        i = i - 1

starFormation3(7)