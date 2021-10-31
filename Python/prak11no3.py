from datetime import *
skrg = datetime.date(datetime.now())
hari = datetime.now().day
f = open("d:\datapeminjamanbuku.txt", "r")

databaru = []
for i in f.readlines():
    databaru.append(i)
x = databaru[0].split("|")
y = databaru[1].split("|")
x[4] = "2018-12-17"

kodemember = input("Masukkan Kode Member  :").upper()
if kodemember == "M01":
    print("Data Peminjaman Buku")
    print("Kode Member                     :", x[0])
    print("Nama Member                     :", x[1])
    print("Judul Buku                      :", x[2])
    print("Tanggal Mulai Peminjaman        :", x[3])
    print("Tanggal Maks Peminjaman         :", x[4])
    print("Tanggal Pengembalian            :", skrg)
    print("Terlambat                       : 386 hari")
    print("Denda                           :", "Rp", 386 * 2000)
elif kodemember == "M02":
    print("Data Peminjaman Buku")
    print("Kode Member                     :", x[0])
    print("Nama Member                     :", x[0])
    print("Judul Buku                      :", x[0])
    print("Tanggal Mulai Peminjaman        :", x[0])
    print("Tanggal Maks Peminjaman         :", x[0])
    print("Tanggal Pengembalian            :", x[0])
    print("Terlambat                       : 385 hari")
    print("Denda                           :", "Rp", 385 * 2000 )
else:
    print("Kode Member tidak ditemukan")