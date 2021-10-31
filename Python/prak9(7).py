mhs = ['K001:ROSIHAN ARI:1979-09-01:SOLO', 
       'K002:DWI AMALIA FITRIANI:1979-09-17:KUDUS',
       'K003:FAZA FAUZAN:2005-01-28:KARANGANYAR']
print("=============================================================")
print('NIM\t NAMA MAHASISWA\t\t TGL LAHIR\t TEMPAT LAHIR')
print("-------------------------------------------------------------")
z = 0
datatanggal = []
for i in mhs:
    i = mhs[z].split(":")
    z += 1
    datatanggal.append(i)
b = 0
datatanggal2 = []
for j in datatanggal:
    y = datatanggal[b][2].split("-")
    b += 1
    datatanggal2.append(y)
o = (datatanggal2[0][2] + "/" + datatanggal2[0][1] + "/" + datatanggal2[0][0])
p = (datatanggal2[1][2] + "/" + datatanggal2[1][1] + "/" + datatanggal2[1][0])
q = (datatanggal2[2][2] + "/" + datatanggal2[2][1] + "/" + datatanggal2[2][0])
i = mhs[0].split(":")
print(i[0], '\t', i[1], '\t\t', o, '\t', i[3])
i = mhs[1].split(":")
print(i[0], '\t', i[1], '\t', p, '\t', i[3])
i = mhs[2].split(":")
print(i[0], '\t', i[1], '\t\t', q, '\t', i[3])
print("-------------------------------------------------------------")
    



