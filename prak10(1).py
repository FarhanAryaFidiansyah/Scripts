f = open("d:\dataangkaprak10.txt", "r")
tes = f.readlines()
for i in range(0, len(tes)): 
    tes[i] = int(tes[i])
genap = 0
ganjil = 0
for x in tes:
    if x % 2 == 0:
    	genap += 1
    else:
    	ganjil += 1
print('Banyaknya bilangan genap :', genap)
print('Banyaknya bilangan ganjil :', ganjil)