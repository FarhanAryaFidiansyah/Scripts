buah = {"apel" : 5000, "jeruk" : 8500, "mangga" : 7800, "duku" :6500}
print("Menu :")
print("A.", "Tambah data buah")
print("B.", "Beli Buah")
print("C.", "Hapus buah")
pilih = input("Pilihan menu :")
if pilih == "A":
    nama = input("Masukkan nama buah :")
    harga = int(input("Masukkan harga satuan :"))
    if nama not in buah.keys():
        buah[nama] = harga
        print("Data buah :")
        for keys,values in buah.items():
            print("-", str(keys) + "(Harga Rp.", str(values) + ")")
    elif nama in buah.keys():
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
elif pilih == "C":
    hapus = input("Nama buah yang ingin dihapus :")
    del buah[hapus]
    print("Data buah :")
    for keys,values in buah.items():
        print("-", str(keys) + "(Harga Rp.", str(values) + ")")
    