buah = {"apel" : 5000, "jeruk" : 8500, "mangga" : 7800, "duku" :6500}
def mahalkemurah(data):
    sorted_values = sorted(data.values())
    sorted_buah = {}
    for x in sorted_values:
        for y in buah.keys():
            if data[y] == x:
                sorted_buah[y] = data[y]
                break
    print(sorted_buah)

mahalkemurah(buah)