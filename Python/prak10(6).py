inputfile = input("Masukkan nama file teks :")
isiteks = open(inputfile, "r")
kalimat = isiteks.readline()
n = int(input("Berapa perpindahan: "))
sandi = ""
for y in kalimat:
    if y == " ":
        sandi += " "
    elif ord(y) + n > ord("Z"):
        sandi += chr(ord(y) + n - 26)
    else:
        sandi += chr(ord(y) + n)
h = open("d:/tekssandi.txt", "w")
h.write(sandi)