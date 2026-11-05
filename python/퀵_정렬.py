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

