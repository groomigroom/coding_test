def solution(num_list):
    answer = 0
    gop = 1
    if len(num_list) >= 11:
        for i in range(len(num_list)):
            answer += num_list[i]
    else:
        for i in range(len(num_list)):
            gop *= num_list[i]
        answer = gop
    return answer
