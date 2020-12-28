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


