def solution(arr, queries):
    answer = []
    
    for i in range(0, len(queries)):
        tmp = arr[queries[i][0]]
        arr[queries[i][0]] =arr[queries[i][1]]
        arr[queries[i][1]] = tmp
    for k in range(0, len(arr)):
        answer.append(arr[k])
    return answer
