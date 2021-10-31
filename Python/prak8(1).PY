a = [1, 5, 6, 3, 6, 9, 11, 20, 12]
b = [7, 4, 5, 6, 7, 1, 12, 5, 9]
a.sort()
b.sort()
c = []
d = []
c = a[0:7]
d = b[2:9]
#[1, 3, 5, 6, 6, 9, 11] = list c
#[5, 5, 6, 7, 7, 9, 12] = list d
e = []

n = 0
for i in c and d:
    e.append(c[n] + d[n])
    n += 1

x = tuple(e)
print(min(x))
print(max(x))
print(sum(x))

myString = "python adalah bahasa pemograman yang menyenangkan"
myList = list(set(myString))
myList.sort()
print(myList)