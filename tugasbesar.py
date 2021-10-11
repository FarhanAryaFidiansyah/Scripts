def login():
    print("PILIH APA MAUMU")
    print("1 : Login Mahasiswa")
    print("2 : Login Admin")
    print("0 : Exit")
    pilihanawal = int(input())
    if pilihanawal == 1:
        print("testloginmahasiswa")
    elif pilihanawal == 2:
        print("testloginadmin")
    elif pilihanawal == 0:
        print("testexit")
    else:
        print("Pilihan anda tidak valid")
    
login()
