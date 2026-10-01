def solution(my_string, queries):
    answer = ''
    for i in range(len(queries)):
        prefix = my_string[0:queries[i][0]]
        middle = "".join(reversed(my_string[queries[i][0]:queries[i][1]+1]))
        suffix = my_string[queries[i][1]+1:]

        my_string = prefix + middle + suffix
    answer = my_string
    return answer
