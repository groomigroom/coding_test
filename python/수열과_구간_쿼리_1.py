def solution(arr, queries):
    for j in range(len(queries)):
        for i in range(queries[j][0], queries[j][1]+1):
            arr[i] += 1
    return arr

print(solution([0, 1, 2, 3, 4]
