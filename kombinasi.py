def faktorial(n):
    if n == 0:
        return 1
    else:
        return n * faktorial(n-1)

def kombinasi(a, b):
    return faktorial(a) / (faktorial(b) * (faktorial(a - b)))

