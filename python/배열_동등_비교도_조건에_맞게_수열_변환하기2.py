def solution(arr):
    arr2 = [0] * len(arr)
    count = 0
    while (True):
        for j in range(len(arr)):
            if arr[i] >= 50 and arr[i] % 2 == 0:
                arr[i] /= 2
            elif arr[i] < 50 and arr[i] % 2 == 1:
                arr[i] = arr[i] * 2 + 1
        
        if arr == arr2:
            break
        count += 1

    return count
