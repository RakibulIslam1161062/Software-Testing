import itertools
number = int(input("Number of variables\n"))
count=1
variablRange =[]
readyArrays = []

normal=[]
for f in range (number):
    vRange = int(input( "Variable range for variable  "+ str(f+1))+"\n")
    variablRange.append(vRange)
    vRange = int(input())
    variablRange.append(vRange)

def getReady(var1,var2):
    varibaleArray = []
    varibaleArray.append(var1)
    varibaleArray.append(var2)
    varibaleArray.append(var1+1)
    varibaleArray.append(var2-1)
    varibaleArray.append(var2+1)
    varibaleArray.append(var1-1)
    varibaleArray.append(var1+var2//2)
    normal.append(var1+var2//2)
    return varibaleArray

for f in range(number):
    pos1 = 2*(f+1)-2
    pos2 = pos1+1
    readyArrays.append(getReady(variablRange[pos1],variablRange[pos2]))


def getReadyForBVC():
    listForbvc = []
    temp = []
    for i in range (len(readyArrays)):
        temp = readyArrays[i]
        temp = temp[:4]
        listForbvc.append(temp)

    return listForbvc

def getReadyForRobust():
    listForbvc = []
    temp = []
    for i in range (len(readyArrays)):
        temp = readyArrays[i]
        temp = temp[:6]
        listForbvc.append(temp)

    return listForbvc

def getReadyForWorst():
    listForbvc = []
    temp = []
    for i in range (len(readyArrays)):
        temp = readyArrays[i]
        temp = temp[:4]
        temp.append(normal[i])
        listForbvc.append(temp)

    return listForbvc


def printBVC():

    global count
    values = []

    values = getReadyForBVC()
    print(values)

    for i in range(number):
        cartesianList = []
        cartesianList.append(values[i])
        for j in range (len(normal)):
            if i == j:
                continue
            norValue = []
            norValue.append(normal[j])
            cartesianList.append(norValue)
        for t in itertools.product(*cartesianList):
            print("Test id: "+str(count))
            print(t)
            count = count+1
    cartesianList = []
    for i in range(len(normal)):
        temp = []
        temp.append(normal[i])
        cartesianList.append(temp)

    for t in itertools.product(*cartesianList):
        print("Test id: " + str(count))
        count+=1
        print(t)

def printRobust():

    global count
    values = []

    values = getReadyForRobust()
    print(values)

    for i in range(number):
        cartesianList = []
        cartesianList.append(values[i])
        for j in range (len(normal)):
            if i == j:
                continue
            norValue = []
            norValue.append(normal[j])
            cartesianList.append(norValue)
        for t in itertools.product(*cartesianList):
            print("Test id: "+str(count))
            print(t)
            count = count+1
    cartesianList = []
    for i in range(len(normal)):
        temp = []
        temp.append(normal[i])
        cartesianList.append(temp)

    for t in itertools.product(*cartesianList):
        print("Test id: " + str(count))
        print(t)

def printWorst():
    # printBVC()
    global count
    values = []

    values = getReadyForWorst()
    print(values)
    cartesianList = []
    for i in range(number):
        cartesianList.append(values[i])
    for t in itertools.product(*cartesianList):
        print("Test id: "+str(count))
        print(t)
        count = count+1




print("BVC : "+"\n")
printBVC()
count =1
print("Robust : "+"\n")
printRobust()
print("Worst : "+"\n")
count =1
printWorst()
