buah = {"apel" : 5000, "jeruk" : 8500, "mangga" : 7800, "duku" :6500}
print("Menu :")
print("A.", "Tambah data buah")
print("B.", "Beli Buah")
pilih = input("Pilihan menu :")
if pilih == "A":
    nama = input("Masukkan nama buah :")
    harga = int(input("Masukkan harga satuan :"))
    buah[nama] = harga
    if nama in buah.keys():
        print("Nama buah sudah ada")
elif pilih == "B":
    nama = input("Nama buah yang ingin dibeli :")
    kg = int(input("Berapa Kg :"))
    jum = 0
    harga = buah[nama] * kg
    jum = jum + harga
    while True:
        lagi = input("Beli buah yang lain (y/n) :")
        if lagi == "y":
            nama = input("Nama buah yang ingin dibeli :")
            kg = int(input("Berapa Kg :"))
            harga = buah[nama] * kg
            jum = jum + harga
        elif lagi == "n":
            print("Harga yang perlu dibayarkan adalah", jum) 
            break
