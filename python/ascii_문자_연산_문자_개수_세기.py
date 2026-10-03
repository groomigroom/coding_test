def solution(my_string):
    answer = []
    for i in range(52):
        answer.append(0)

    for j in rnage(len(my_string)):
        ch = my_string[j]
        if ord(ch) >= ord('A') and ord(ch) <= ord('Z'):
            answer[ord(ch) - ord('A')] += 1
        elif ord(ch) >= ord('a') and ord(ch) <= ord('z'):
            answer[ord(ch) - ord('a') + 26] += 1


    return answer
