f = open("d:\datamahasiswa.txt", "w+")
nim = input("Masukkan NIM  :")
nama = input("Masukkan Nama Mahasiswa  :")
Alamat = input("Masukkan Alamat :")
f.write(nim + "|" + nama + "|" + Alamat + "\n")
lagi = input("Ulangi input lagi(y/n) :")
while lagi == "y":
    nim = input("Masukkan NIM  :")
    nama = input("Masukkan Nama Mahasiswa  :")
    Alamat = input("Masukkan Alamat :")
    f.write(nim + "|" + nama + "|" + Alamat + "\n")
    lagi = input("Ulangi input lagi(y/n) :")
    if lagi == "n":
        break
f = open("d:\datamahasiswa.txt", "r")
dataMhs = []
a = f.readlines()
z = 0
for x in a:
    ini = a[z].split("|")
    b = ini[2].split("\n")
    c = b[0]
    z += 1
    dictionary = {}
    dictionary["NIM"] = ini[0]
    dictionary["Nama"] = ini[1]
    dictionary["Alamat"] = c
    dataMhs.append(dictionary)
print(dataMhs)


