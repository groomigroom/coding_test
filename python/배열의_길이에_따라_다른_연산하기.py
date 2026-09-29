def solution(arr, n):
    answer = []
    for i in range(len(arr)):
        answer.append(0)
    if len(arr)%2 == 1:
        for i in range(len(arr)):
            if i%2 == 0:
                answer[i] = arr[i] + n
            else:
                answer[i] = arr[i]
    else:
        for i in range(len(arr)):
            if i%2 == 1:
                answer[i] = arr[i] + n
            else:
                answer[i] = arr[i]
                
    return answer


----------------------------------


