function solution(my_string) {
    let answer = [];
    for (let i = 0; i < 52; i++) {
        answer.push(0);
    }
    for (let j = 0; j < my_string.length; j++) {
        let ch = my_string[j];
        if (ch.charCodeAt(0) >= 'A'.charCodeAt(0) && ch.charCodeAt(0) <= 'Z'.charCodeAt(0)) {
            answer[ch.charCodeAt(0) - 'A'.charCodeAt(0)]++;       // 대문자: 0 ~ 25
        } else if (ch.charCodeAt(0) >= 'a'.charCodeAt(0) && ch.charCodeAt(0) <= 'z'.charCodeAt(0)) {
            answer[ch - 'a' + 26]++;  // 소문자: 26 ~ 51
        }
    }
    return answer;
}
