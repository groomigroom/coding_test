def solution(myString):
    answer = []
    count = 0
    for i in range(len(myString)):
        if myString[i] != 'x':
            count += count
    return answer
