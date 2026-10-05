function solution(strArr) {
    let answer = [];
    for (let i = 0; i < strArr.length; i++) {
        if (i % 2 == 0) {
            answer[i] = strArr[i].toLowerCase();
        } else {
            // 💡 3. 홀수 인덱스는 문자열 전체를 한 번에 대문자로 변환하여 넣습니다.
            answer[i] = strArr[i].toUpperCase();
        }
    }
    return answer;
}
