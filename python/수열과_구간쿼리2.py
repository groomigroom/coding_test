def solution(arr, queries):
    answer = []
    for i in range(len(queries)):
        s = queries[i][0]
        e = queries[i][1]
        k = queries[i][2]
    
        minVal = 10000001

        for idx in range(s, e + 1):
            if (arr[idx] > k and arr[idx] < minVal):
                minVal = arr[idx]

        if minVal == 10000001:
            answer.append(-1)
        else:
            answer.append(minVal)
    return answer
