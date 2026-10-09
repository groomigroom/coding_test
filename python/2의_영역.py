def solution(arr):
    answer = []
    ii = -1
    iii = -1
    for i in range(len(arr)):
        if arr[i] == 2 and ii == -1:
            ii = i
        elif arr[i] == 2:
            iii = i
    return answer
