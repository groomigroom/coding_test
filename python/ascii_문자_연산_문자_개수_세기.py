def solution(my_string):
    answer = []
    for i in range(52):
        answer.append(0)

    for j in rnage(len(my_string)):
        ch = my_string[j]
        if ()

    for (int j = 0; j < my_string.length(); j++) {
        char ch = my_string.charAt(j);
        
        if (ch >= 'A' && ch <= 'Z') {
            answer[ch - 'A']++;       // 대문자: 0 ~ 25
        } else if (ch >= 'a' && ch <= 'z') {
            answer[ch - 'a' + 26]++;  // 소문자: 26 ~ 51
        }
    }

    return answer
