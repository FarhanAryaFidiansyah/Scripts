data = []
n = int(input("Input berapa banyak mahasiswa :"))
while n > 0:
    namaMahasiswa = input("Masukkan nama :")
    data.append(namaMahasiswa)
    n -= 1
data.sort()
print("------HASIL------")
i = 0
for x in data:
    print(data[i], end="")
    print("", "(" + str(len(x)), "karakter" + ")")
    i += 1


