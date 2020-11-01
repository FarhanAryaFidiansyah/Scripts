def faktorial(n):
    if n == 0:
        return 1
    else:
        return n * faktorial(n-1)

def permutasi(a, b):
    return faktorial(a) / faktorial(a - b)

print(permutasi(3, 2))
