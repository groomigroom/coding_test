def solution(my_string, is_suffix):
    answer = 0
    count = 0
    if len(is_suffix) > len(my_string):
        return 0
    for i in range(len(is_suffix)):
        if is_suffix[len(is_suffix)-1-i] == my_string[len(my_string)-1-i]:
            count += 1
    if count == len(is_suffix):
        answer = 1
    return answer
