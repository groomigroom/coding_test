def solution(arr):
    answer = []
    for i in range(len(arr)):
        if arr[i] >= 50 and arr[i] % 2 == 0:
            arr[i] /= 2
        elif arr[i] < 50 and arr[i] % 2 != 0:
            arr[i] *= 2
    for j in range(len(arr)):
        answer.append(arr[j])
    return answer
