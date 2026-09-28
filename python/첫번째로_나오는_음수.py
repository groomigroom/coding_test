def solution(num_list):
    answer = 0
    for i in range(0, len(num_list)):
        if num_list[i] < 0:
            answer = i
            break
        else:
            answer = -1
    return answer
