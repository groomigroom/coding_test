def solution(myString, pat):
    answer = ''
    index_start = 0
    if len(pat) != 1:
        for i in range(len(myString) - len(pat) + 2):
            if myString[i] == pat[0]:
                count = 0
                for j in range(len(pat)):
                    if myString[i+j] == pat[j]:
                        count += 1
                if count == len(pat):
                    index_start = i
    return answer
