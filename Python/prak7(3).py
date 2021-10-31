jum = 0
totalAngka = 0
print("------------------------")
print("PROGRAM HITUNG RATA-RATA")
print("------------------------")
try:
    x = int(input("Masukkan bilangan: "))
    lagi = input("lagi (y/n):")
    jum += x
    totalAngka += 1
except ValueError:
    print("Bukan bilangan bulat")
    x = int(input("Masukkan bilangan: "))
    lagi = input("lagi (y/n):")
    jum += x
    totalAngka += 1
try:
    while lagi == "y":
        try:
            x = int(input("Masukkan bilangan: "))
            lagi = input("lagi (y/n):")
            jum += x
            totalAngka += 1
            if lagi == "n":
                break
        except ValueError:
            print("Bukan bilangan bulat")
            x = int(input("Masukkan bilangan: "))
            lagi = input("lagi (y/n):")
            jum += x
            totalAngka += 1  
except ValueError:
    print("Bukan bilangan bulat")
    x = int(input("Masukkan bilangan: "))
    lagi = input("lagi (y/n):")
    jum += x
    totalAngka += 1 

rata2 = jum / totalAngka
print("Rata-ratanya adalah:", rata2)