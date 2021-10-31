def dataStat(*listnya):
    x = list(listnya)
    a = sum(x) / len(x)
    b = max(x)
    c = min(x)
    newlist = []
    newlist.append(a)
    newlist.append(b)
    newlist.append(c)
    print(newlist)

dataStat(1, 2, 3)
    