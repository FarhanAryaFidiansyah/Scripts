n = int(input("Masukkan jumlah :"))
data = []
while n > 0:
    print("Masukkan bilangan bulat :", end="")
    bilbulat = int(input())
    data.append(bilbulat)
    n -= 1
data.sort(reverse=True)
print(data)