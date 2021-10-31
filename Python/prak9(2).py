def bintang(n):
    a = 0
    b = 1
    c = "*"
    while a < n:
        d = b * c
        print(d.center(20))
        a += 1
        b += 2

bintang(4)