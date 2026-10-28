def solution(myString, pat):
    answer = 0
    for i in range(len(myString) - len(pat) + 1):
        count = 0
        if myString[i] == pat[0]:
            for j in range(len(pat)):
                if myString[i+j] == pat[j]:
                    count += 1
            if count == len(pat):
                answer += 1
            count = 0
    return answer
