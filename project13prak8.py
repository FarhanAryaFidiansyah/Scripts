nilaiMhs = [{"nim" : "A01", "nama" : "Amir", "mid" : 50, "uas" : 80},
            {"nim" : "A02", "nama" : "Budi", "mid" : 40, "uas" : 90},
            {"nim" : "A03", "nama" : "Cici", "mid" : 50, "uas" : 80},
            {"nim" : "A04", "nama" : "Dedi", "mid" : 20, "uas" : 30},
            {"nim" : "A05", "nama" : "Fifi", "mid" : 70, "uas" : 40}]
        
z = 0
nilai = []
for i in nilaiMhs:
    print("NIM :", nilaiMhs[z]["nim"] + "|" +"Nama :", nilaiMhs[z]["nama"] + "|", end="")
    nilai.append((nilaiMhs[z]["mid"] + 2 * nilaiMhs[z]["uas"]) / 3)
    print("Nilai Akhir :", (nilaiMhs[z]["mid"] + 2 * nilaiMhs[z]["uas"]) / 3)
    z += 1
print("Nama", "Budi , NIM A02, dengan nilai :", max(nilai))
