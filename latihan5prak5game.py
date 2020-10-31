import random
jawaban = random.randint(0, 100)

print("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!")
tebakan = 1

while tebakan != jawaban :
    tebakan = int(input("Tebakan Anda:"))
    if tebakan == jawaban:
        print("Yeeee… Bilangan tebakan anda BENAR :-)")
    elif tebakan > jawaban:
        print("Hehehe… Bilangan tebakan anda terlalu besar")
    else:
        print("Hehehe… Bilangan tebakan anda terlalu kecil")