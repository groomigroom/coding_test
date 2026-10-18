function solution(my_string) {
    let answer = [];
    let start_index = 0;
    for (let i = 0; i < my_string.length; i++) {
        answer.push(my_string)
    }
    return answer;
}

/*
def solution(my_string):
    answer = []
    start_index = 0
    for i in range(len(my_string)):
        if my_string[i] == ' ':
            answer.append(my_string[start_index:i])
            start_index = i + 1
        elif i == len(my_string) - 1:
            answer.append(my_string[start_index:])
    return answer

https://school.programmers.co.kr/learn/courses/30/lessons/181869?language=javascript
*/
