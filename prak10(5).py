f = open('d:/angka2.txt', "r")
a = f.readlines()
z = 0
dataangka = []
for i in a:
    b = a[z].split("|")
    z += 1
    dataangka.append(b)

for i in range(0, len(dataangka)):
    dataangka[i][0] = int(dataangka[i][0])
    dataangka[i][1] = int(dataangka[i][1])
n = 0
for m in dataangka:    
    hasil = dataangka[n][0] + dataangka[n][1]
    n += 1
    print(hasil)