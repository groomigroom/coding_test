def solution(arr1, arr2):
    answer = 0
    if len(arr1) > len(arr2):
        answer = 1
    elif len(arr1) < len(arr2):
        answer = -1
    else:
        arr1hap = 0
        arr2hap = 0
        for i in range(len(arr1)):
            arr1hap += arr1[i]
            arr2hap += arr2[i]
        if arr1hap > arr2hap:
            answer = 1
        elif arr1hap == arr2hap:
            answer = 0
        else:
            answer = -1
    return answer
