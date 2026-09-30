def solution(a, b):
    answer = 0
    ii = ""
    ii = ii + str(a) + str(b)
    ii_last = int(ii)
    ii_last2 = 2 * a * b
    if (ii_last > ii_last2):
        answer = ii_last
    else:
        answer = ii_last2
    
    return answer
