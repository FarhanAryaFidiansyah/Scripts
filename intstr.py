jum = 0
totalAngka = 0
print("------------------------")
print("PROGRAM HITUNG RATA-RATA")
print("------------------------")
try:
    x = int(input("masukkan"))
except ValueError:
    while True:
        print("coba lagi")
        x = input("masukkan")
        if x.isdigit():
            break
print(type(x))