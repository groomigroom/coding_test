def solution(arr, query):
    for i in range(0, len(query)):
        if i % 2 == 0:
            arr = arr[:query[i] + 1]
        else:
            arr = arr[query[i]:]
    answer = []
    for i in range(len(arr)):
        answer.append(arr[i])
    
    
    return answer

arr = [0, 1, 2, 3, 4, 5]
query = [4, 1, 2]

print(solution(arr, query))
