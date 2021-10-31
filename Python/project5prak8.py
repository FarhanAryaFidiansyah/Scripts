def kuadrat(*angka2):
    listkuadrat = list(angka2)
    data = []
    i = 0
    for x in angka2:
        listkuadrat[i] *= listkuadrat[i]
        i += 1
    data.append(listkuadrat)
    print(data)
kuadrat(1, 2, 4, 5 , 10)
   