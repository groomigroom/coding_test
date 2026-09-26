def solution(n, control):
    answer = 0
    for i in range (0, len(control)):
        match control[i]:
            case 'w':
                n += 1
                pass
            case 's':
                n -= 1
                pass
            case 'd':
                n += 10
                pass
            case 'a':
                n -= 10
                pass
    answer = n;
    return answer
