import datetime

def diffDate(x):
    y = x.split("-")
    inihari = "".join(y[2])
    skrng = datetime.datetime.now()
    selisih = int(inihari) - skrng.day
    return selisih


print(diffDate("2021-1-10"))