import math
A = "Rp 10.000.000"
B = "Rp 8.500.000"
C = "Rp 7.000.000"
D = "Rp 5.500.000"
potA = (10000000 * 2.5) / 100
potB = (8500000 * 2.0) / 100
potC = (7000000 * 1.5) / 100
potD = (5500000 * 1.0) / 100

kode = input("Masukkan kode karyawan    :")
nama = input("Masukkan nama karyawan    :")
gol  = input("Masukkan golongan         :")

print("====================================")
print("STRUK RINCIAN GAJI KARYAWAN")
print("------------------------------------")

if gol == "A":
    print("Nama Karyawan		  :" + nama + "(Kode:" + kode + ")")
    print("Golongan                  :" + gol)
    print("------------------------------------")
    print("Gaji Pokok                :" + A)
    print("Potongan(2.5%)            :" + str(potA))
    print("------------------------------------ -")
    print("Gaji Bersih               :" + str(10000000 - potA))
elif gol == "B":
    print("Nama Karyawan		  :" + nama + "(Kode:" + kode + ")")
    print("Golongan                  :" + gol)
    print("------------------------------------")
    print("Gaji Pokok                :" + B)
    print("Potongan(2.0%)            :" + str(potB))
    print("------------------------------------ -")
    print("Gaji Bersih               :" + str(8500000 - potB))
elif gol == "C":
    print("Nama Karyawan		  :" + nama + "(Kode:" + kode + ")")
    print("Golongan                  :" + gol)
    print("------------------------------------")
    print("Gaji Pokok                :" + C)
    print("Potongan(1.5%)            :" + str(potC))
    print("------------------------------------ -")
    print("Gaji Bersih               :" + str(7000000 - potC))
elif gol == "D":
    print("Nama Karyawan		  :" + nama + "(Kode:" + kode + ")")
    print("Golongan                  :" + gol)
    print("------------------------------------")
    print("Gaji Pokok                :" + D)
    print("Potongan(1.0%)            :" + str(potD))
    print("------------------------------------ -")
    print("Gaji Bersih               :" + str(5500000 - potD))
else:
    print("Maaf coba input kembali golongan anda")