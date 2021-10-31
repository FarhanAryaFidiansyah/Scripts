import random
def shuffleString(x, n):
    l = list(x)
    resultnya = []
    while n > 0:
        random.shuffle(l)
        resultnya.append(''.join(l))
        n -= 1
        if n == 0:
            break
    print(resultnya)
shuffleString("aku", 3)