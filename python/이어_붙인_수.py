def solution(num_list):
    answer = 0
    hol = ""
    jjak = ""
    for i in range(0, len(num_list)):
        if num_list[i] % 2 == 0:
            jjak += str(num_list[i])
        else:
            hol += str(num_list[i])
    answer = int(jjak) + int(hol)
    return answer