filenya = input("Masukkan nama file:")
data = input("Data yang mau ditambahkan :")
file = open(filenya, "a")
file.write(data)
lagi = input("Mau lagi (y/n):")
while lagi == "y":
    data = input("Data yang mau ditambahkan :")
    file.write(data)
    lagi = input("Mau lagi (y/n):")
    if lagi == "n":    
        file.close()
if lagi == "n"
    file.close()