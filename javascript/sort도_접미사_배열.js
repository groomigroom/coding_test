function solution(my_string) {
    let answer = [];
    for (let i = 0; i < my_string.length; i++) {
        let ii = my_string.substring(i, my_string.length);
        answer.push(ii);
    }
    return answer;
}
