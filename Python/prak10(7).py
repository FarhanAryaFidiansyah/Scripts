inputfile = input("Masukkan nama file teks :")
isiteks = open(inputfile, "r")
sandi = isiteks.readline()
n = int(input("Berapa perpindahan: "))
kalimat = ""
for y in sandi:
    if y == " ":
        kalimat += " "
    elif ord(y) - n < ord("A"):
        kalimat += chr(ord(y) - n + 26)
    else:
        kalimat += chr(ord(y) - n)
h = open("d:/teksnormal.txt", "w")
h.write(kalimat)