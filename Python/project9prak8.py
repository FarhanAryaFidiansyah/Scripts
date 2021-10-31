buah = {"apel" : 5000, "jeruk" : 8500, "mangga" : 7800, "duku" :6500}
nama = input("Nama buah yang ingin dibeli :")
kg = int(input("Berapa Kg                   :"))
harga = buah[nama] * kg
print("-------------------------")
print("Total harga                 :", harga)
