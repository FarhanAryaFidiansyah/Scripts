buah = {"apel" : 5000, "jeruk" : 8500, "mangga" : 7800, "duku" :6500}
nama = input("Nama buah yang ingin dibeli :")
kg = int(input("Berapa Kg                   :"))
jum = 0
harga = buah[nama] * kg
jum = jum + harga
while True:
    lagi = input("Beli buah yang lain (y/n)   :")
    if lagi == "y":
        nama = input("Nama buah yang ingin dibeli :")
        kg = int(input("Berapa Kg                   :"))
        harga = buah[nama] * kg
        jum = jum + harga
    elif lagi == "n":
        print("-------------------------")
        print("Total harga                 :", jum)
        break
