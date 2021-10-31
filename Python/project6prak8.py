def sortStringbyChar(x):
    newdata = []
    for i in x:
        newdata.extend([i])
    print(sorted(newdata, key=len))

myData = ["apel", "semangka", "jeruk", "durian"]
sortStringbyChar(myData)