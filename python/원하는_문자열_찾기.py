def solution(myString, pat):
    answer = 0
    lowMyString = myString.lower()
    lowPat = pat.lower()
    if lowPat in lowMyString:
        answer = 1
    return answer
