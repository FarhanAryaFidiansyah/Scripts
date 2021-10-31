buah = {"apel" : 5000, "jeruk" : 8500, "mangga" : 7800, "duku" :6500}
def rata2(data):
    print(sum(data.values()) / float(len(data)))

rata2(buah)