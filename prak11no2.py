from datetime import *
f = open("d:\datapeminjamanbuku.txt", "w")
skrg = datetime.date(datetime.now())
maks = skrg + timedelta(days=7)
km = input("Masukkan Kode Member:")
nm = input("Masukkan Nama Member:")
jb = input("Masukkan Judul Buku")
f.write(km + '|' + nm + '|' + jb + '|' + str(skrg) + '|' + str(maks) + '\n')
lagi = input("Ulangi lagi(y/n):")
if lagi == "y":
    while True:
        km = input("Masukkan Kode Member:")
        nm = input("Masukkan Nama Member:")
        jb = input("Masukkan Judul Buku")
        f.write(km + '|' + nm + '|' + jb + '|' + str(skrg) + '|' + str(maks) + '\n')
        lagi = input("Ulangi lagi(y/n):")
        if lagi == "n":
            break
