menu = ["bayam", "kangkung", "wortel", "selada"]
print("Menu :")
print("A.", "Tambah data sayur")
print("B.", "Hapus data sayur")
print("C.", "Tampilkan data sayur")
pilihan = input("Pilihan Anda :")

if pilihan == "A":
    print("Nama sayur yang ingin ditambahkan :", end="")
    sayur = input("")
    menu.append(sayur)
elif pilihan == "B":
    try:
        print("Nama sayur yang ingin dihapus :", end="")
        hapus = input("")
        menu.remove(hapus)
    except:
        print("SAYUR TIDAK DITEMUKAN")
elif pilihan == "C":
    print("---DAFTAR SAYURAN---")
    i = 0
    z = 1
    for x in menu:
        print(str(z) + ".", end="")
        print(menu[i])
        z += 1
        i += 1
else:
    print("Pilihan tidak ada, silahkan pilih kembali..")