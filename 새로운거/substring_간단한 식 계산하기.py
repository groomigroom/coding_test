def solution(binomial):
    answer = 0
    i = 0
    while (binomial[i] != ' '):
        i += 1
    first_number = int(binomial[0:i])
    binomial = binomial[i+1, len(binomial)]

    j = 0
    while binomial[j] != ' ':
        j += 1
    plMiGop = binomial[0]
    second_number
    return answer

