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
nimnya = input("Masukkan NIM :")
if nimnya == "K3518001":
    print("Data Mahasiswa")
    print("NIM  :", dataMhs[0]["NIM"])
    print("Nama :", dataMhs[0]["Nama"])
    print("Alamat :", dataMhs[0]["Alamat"])
elif nimnya == "K3518002":
    print("Data Mahasiswa")
    print("NIM  :", dataMhs[1]["NIM"])
    print("Nama :", dataMhs[1]["Nama"])
    print("Alamat :", dataMhs[1]["Alamat"])
elif nimnya == "K3518003":
    print("Data Mahasiswa")
    print("NIM  :", dataMhs[2]["NIM"])
    print("Nama :", dataMhs[2]["Nama"])
    print("Alamat :", dataMhs[2]["Alamat"])
else:
    print("Data tidak ditemukan")
