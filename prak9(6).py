nilai = [{'nim' : 'A01', 'nama' : 'Agustina', 'mid' : 50, 'uas' : 80},
        {'nim' : 'A02', 'nama' : 'Budi', 'mid' : 40, 'uas' : 90}, 
        {'nim' : 'A03', 'nama' : 'Chicha', 'mid' : 100, 'uas' : 50}, 
        {'nim' : 'A04', 'nama' : 'Donna', 'mid' : 20, 'uas' : 100}, 
	    {'nim' : 'A05', 'nama' : 'Fatimah', 'mid' : 70, 'uas' : 100}]
print("================================================================")
print('NIM\t NAMA\t  N.MID\t  N.UAS\t N.AKHIR\t\t STATUS')
print("----------------------------------------------------------------")
z = 0
dataakhir = []
for i in nilai:
    uas = (nilai[z]["mid"] + 2 * nilai[z]["uas"]) / 3
    dataakhir.append(uas)
    z += 1
print(nilai[0]['nim'], '\t', nilai[0]['nama'], "  ", nilai[0]['mid'], '    ', nilai[0]['uas'],'   ', dataakhir[0], '\t\t ', "LULUS")
print(nilai[1]['nim'], '\t', nilai[1]['nama'], "      ", nilai[1]['mid'], '    ', nilai[1]['uas'],'   ', dataakhir[1], '   ', "LULUS")
print(nilai[2]['nim'], '\t', nilai[2]['nama'], "   ", nilai[2]['mid'], '    ', nilai[2]['uas'],'   ', dataakhir[2], '   ', "LULUS")
print(nilai[3]['nim'], '\t', nilai[3]['nama'], "     ", nilai[3]['mid'], '   ', nilai[3]['uas'],'   ', dataakhir[3], '   ', "LULUS")
print(nilai[3]['nim'], '\t', nilai[4]['nama'], "   ", nilai[4]['mid'], '   ', nilai[4]['uas'],'   ', dataakhir[4], '\t\t ', "LULUS")
print("----------------------------------------------------------------")