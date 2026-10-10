def solution(myString, pat):
    answer = ''
    index_start = 0
    if len(pat) != 1:
        for i in range(len(myString) - len(pat) + 2):
            if myString[i] == pat[0]:
    return answer
