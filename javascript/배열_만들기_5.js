function solution(intStrs, k, s, l) {
    let answer = [];
    for (let i = 0; i < intStrs.length; i++) {
        let iii = parseInt(intStrs[i].substring(s, s+l));
        if (iii > k) {
            answer.push(iii);
        }
    }
    return answer;
}
