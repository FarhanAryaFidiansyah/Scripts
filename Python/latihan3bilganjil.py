sum = 0
bil = 0
for i in range(1, 100, 2):
    print(i)
    bil += 1
    suku = i
    sum = sum + suku
print("Banyaknya bilangan ganjil: " + str(bil))
print("Jumlah seluruh bilangan: " + str(sum))
