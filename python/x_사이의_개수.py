def solution(myString):
    answer = []
    count = 0
    for i in range(len(myString)):
        if myString[i] != 'x':
            count += count
        else:
            answer.append(count)
            count = 0
    if myString[len(myString-1)] == 'x':
        answer.append(0)
    if count != 0:
        answer.append(count)
    return answer
