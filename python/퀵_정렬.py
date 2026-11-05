# 퀵 정렬 함수 선언
def quickSort(ary):
    n = len(ary)
    if n <= 1:
        return ary

    pivot = ary[n // 2]
    leftAry, rightAry = [], []
    for num in ary:
        if num < pivot:
            leftAry.append(num)
        elif num > pivot:
            rightAry.append(num)
    return quickSort(leftAry) + [pivot] + quickSort(rightAry)

# main
dataAry = [188, 150,168, 162, 105, 120, 177, 50]
print(dataAry)
dataAry = quickSort(dataAry)
print(dataAry)

--------------------------------------------------------------------------------------------

# 퀵 정렬 함수 선언
def quickSort(ary):
    n = len(ary)
    if n <= 1:
        return ary

    pivot = ary[n // 2]
    leftAry, rightAry = [], []
    for num in ary:
        if num < pivot:
            leftAry.append(num)
        elif num > pivot:
            rightAry.append(num)
    return quickSort(leftAry) + [pivot] + quickSort(rightAry)

# main
dataAry = ["김김", "디디", "니니"]
print(dataAry)
dataAry = quickSort(dataAry)
print(dataAry)
