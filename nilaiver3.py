x = int(input("Masukkan nilai Bahasa Indonesia :"))
y = int(input("Masukkan nilai IPA :"))
z = int(input("Masukkan nilai Matematika :"))

if ((x > 100) or (y > 100) or (z > 100)) or ((x < 0) or (y < 0) or (z < 0)):
    print("Maaf input ada yang tidak valid")
elif (x >= 60) and (y >= 60) and (z > 70):
    print("Status Kelulusan : LULUS")
else:
    print("Status Kelulusan : TIDAK LULUS")
    print("Sebab :")
    if (x < 60):
        print("-Nilai bahasa indonesia kurang dari 60")
    if (y < 60):
        print("-Nilai IPA kurang dari 60")
    if (z <= 70):
        print("-Nilai Matematika kurang dari atau sama dengan 70")

 