def solution(intStrs, k, s, l):
    answer = []
    for i in range(len(intStrs)):
        iii = int(intStrs[i][s:s+l])
        if iii > k:
            answer.append(iii)
    return answer
