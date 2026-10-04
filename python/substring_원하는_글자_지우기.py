def solution(my_string, indices):
    answer = ''
    toDelete = []
    for idx in indices:
        toDelete[idx] = True

    for i in range(len(my_string)):
        if not toDelete[i]:
            answer += my_string[i]
    return answer
