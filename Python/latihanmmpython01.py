tarifAwal = 200000
tarifperJam = 10000
jamAkhir = 23
jamAwal = 6
menitAkhir = 50
menitAwal = 0

lamaWaktu = (jamAkhir - jamAwal) + (menitAkhir - menitAwal) / 60
totalTarif = (tarifperJam * (lamaWaktu - 12)) + tarifAwal
print(totalTarif)