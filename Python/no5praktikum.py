#5.	Modifikasilah kode program dari nomor 3 untuk menghitung dan menampilkan operasi berikut ini menggunakan function-function yang ada dalam operation.py
# a.	2 + 4 * 6 – 4
# b.	(4 + 7) * (6 - 9)
# c.	(10 + 2) / (7 + 5) / (12 - 34) 


def jumlah(a, b):
    hasil = a + b
    return hasil

def kali(a, b):
    hasil = a * b
    return hasil

def kurang(a, b):
    hasil = a - b
    return hasil

def bagi(a, b):
    hasil = a / b
    return hasil

# a.    2 + 4 * 6 – 4
print(kali(4, 6) + kurang(2, 4))

# b.	(4 + 7) * (6 - 9)
print(jumlah(4, 7) * kurang(6, 9))

# c.	(10 + 2) / (7 + 5) / (12 - 34) 
print(jumlah(10, 2) / jumlah(7, 5) / kurang(12, 34))
    
