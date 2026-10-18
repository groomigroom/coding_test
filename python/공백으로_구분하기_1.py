def solution(my_string):
    answer = []
    start_index = 0
    for i in range(len(my_string)):
        if my_string[i] == ' ':
            answer.append(my_string[start_index:i])
            start_index = i + 1
    return answer
