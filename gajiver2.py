import math
kode = input("Masukkan kode karyawan                  :")
nama = input("Masukkan nama karyawan                  :")
gol  = input("Masukkan golongan                       :")
stat = int(input("Masukkan status (1: menikah, 2: blm)	:" ))
if stat == 1:
    anak = int(input("Masukkan jumlah anak			:" ))

print("====================================")
print("STRUK RINCIAN GAJI KARYAWAN")
print("------------------------------------")

if gol == "A":
    gaji = 10000000
    pot = (10000000 * 2.5) / 100
    print("Nama Karyawan		  :" + nama + "(Kode:" + kode + ")")
    print("Golongan                  :" + gol)
    if stat == 1:
        tunjanganIstrisuami = (10000000 * 10) /100
        tunjAnak = (10000000 * 5 / 100) * anak
        print("Status Menikah            :Sudah")
        print("Jumlah Anak               :" + str(anak))
        print("------------------------------------")
        print("Gaji Pokok                :" + "Rp", gaji)
        print("Tunjangan Istri/Suami     :" + "Rp", tunjanganIstrisuami)
        print("Tunjangan Anak            :" + "Rp", tunjAnak)
        print("------------------------------------ +")
        print("Gaji Kotor                :" + "Rp", gaji + tunjanganIstrisuami + tunjAnak )
        print("Potongan(2.5%)            :" + "Rp", str(pot))
        print("------------------------------------ -")
        print("Gaji Bersih               :" + "Rp", (gaji + tunjanganIstrisuami + tunjAnak) - pot)
    elif stat == 2:
        print("------------------------------------")
        print("Gaji Pokok                :" + "Rp", gaji)
        print("Potongan(2.5%)            :" + "Rp", str(pot))
        print("------------------------------------ -")
        print("Gaji Bersih               :" + "Rp", (gaji - pot))
elif gol == "B":
    gaji = 8500000
    pot = (8500000 * 2.0) / 100
    if stat == 1:
        tunjanganIstrisuami = (8500000 * 10) /100
        tunjAnak = (8500000 * 5 / 100) * anak
        print("Status Menikah            :Sudah")
        print("Jumlah Anak               :" + str(anak))
        print("------------------------------------")
        print("Gaji Pokok                :" + "Rp", gaji)
        print("Tunjangan Istri/Suami     :" + "Rp", tunjanganIstrisuami)
        print("Tunjangan Anak            :" + "Rp", tunjAnak)
        print("------------------------------------ +")
        print("Gaji Kotor                :" + "Rp", gaji + tunjanganIstrisuami + tunjAnak )
        print("Potongan(2.0%)            :" + "Rp", str(pot))
        print("------------------------------------ -")
        print("Gaji Bersih               :" + "Rp", (gaji + tunjanganIstrisuami + tunjAnak) - pot)
    elif stat == 2:
        print("------------------------------------")
        print("Gaji Pokok                :" + "Rp", gaji)
        print("Potongan(2.0%)            :" + "Rp", str(pot))
        print("------------------------------------ -")
        print("Gaji Bersih               :" + "Rp", (gaji - pot))
elif gol == "C":
    gaji = 7000000
    pot = (7000000 * 1.5) / 100
    if stat == 1:
        tunjanganIstrisuami = (7000000 * 10) / 100
        tunjAnak = (7000000 * 5 / 100) * anak
        print("Status Menikah            :Sudah")
        print("Jumlah Anak               :" + str(anak))
        print("------------------------------------")
        print("Gaji Pokok                :" + "Rp", gaji)
        print("Tunjangan Istri/Suami     :" + "Rp", tunjanganIstrisuami)
        print("Tunjangan Anak            :" + "Rp", tunjAnak)
        print("------------------------------------ +")
        print("Gaji Kotor                :" + "Rp", gaji + tunjanganIstrisuami + tunjAnak )
        print("Potongan(2.0%)            :" + "Rp", str(pot))
        print("------------------------------------ -")
        print("Gaji Bersih               :" + "Rp", (gaji + tunjanganIstrisuami + tunjAnak) - pot)
    elif stat == 2:
        print("------------------------------------")
        print("Gaji Pokok                :" + "Rp", gaji)
        print("Potongan(2.0%)            :" + "Rp", str(pot))
        print("------------------------------------ -")
        print("Gaji Bersih               :" + "Rp", (gaji - pot))
elif gol == "D":
    gaji = 5500000
    pot = (5500000 * 1.0) / 100
    if stat == 1:
        tunjanganIstrisuami = (5500000 * 10) / 100
        tunjAnak = (5500000 * 5 / 100) * anak
        print("Status Menikah            :Sudah")
        print("Jumlah Anak               :" + str(anak))
        print("------------------------------------")
        print("Gaji Pokok                :" + "Rp", gaji)
        print("Tunjangan Istri/Suami     :" + "Rp", tunjanganIstrisuami)
        print("Tunjangan Anak            :" + "Rp", tunjAnak)
        print("------------------------------------ +")
        print("Gaji Kotor                :" + "Rp", gaji + tunjanganIstrisuami + tunjAnak )
        print("Potongan(2.0%)            :" + "Rp", str(pot))
        print("------------------------------------ -")
        print("Gaji Bersih               :" + "Rp", (gaji + tunjanganIstrisuami + tunjAnak) - pot)
    elif stat == 2:
        print("------------------------------------")
        print("Gaji Pokok                :" + "Rp", gaji)
        print("Potongan(2.0%)            :" + "Rp", str(pot))
        print("------------------------------------ -")
        print("Gaji Bersih               :" + "Rp", (gaji - pot))
else:
    print("Maaf coba input kembali golongan anda")