# a. 5, 10, 4, 9, 30, 16, 2, 11
# b. b.	81, 98, 12, 83, 45, 77, 69, 30, 56

#rata-rata
def average(*angka2):
    sum = 0
    i = 0
    for x in angka2:
        sum += x
        i += 1
    ratarata = sum / i  
    return ratarata

# a. 5, 10, 4, 9, 30, 16, 2, 11
print("Rata-rata a adalah", average(5, 10, 4, 9, 30, 16, 2, 11))

# b. 81, 98, 12, 83, 45, 77, 69, 30, 56
print("Rata-rata b adalah", average(81, 98, 12, 83, 45, 77, 69, 30, 56))

#nilai maksimum
def maks(*angka2):
    tertinggi = max(angka2)
    return tertinggi

# a. 5, 10, 4, 9, 30, 16, 2, 11
print("Nilai maksimum a adalah", maks(5, 10, 4, 9, 30, 16, 2, 11))
# b. 81, 98, 12, 83, 45, 77, 69, 30, 56
print("Nilai maksimum b adalah", maks(81, 98, 12, 83, 45, 77, 69, 30, 56))

#nilai minimum
def minimum(*angka2):
    terendah = min(angka2)
    return terendah

# a. 5, 10, 4, 9, 30, 16, 2, 11
print("Nilai minimum a adalah", minimum(5, 10, 4, 9, 30, 16, 2, 11))
# b. 81, 98, 12, 83, 45, 77, 69, 30, 56
print("Nilai minimum b adalah", minimum(81, 98, 12, 83, 45, 77, 69, 30, 56))