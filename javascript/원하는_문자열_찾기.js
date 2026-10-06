function solution(myString, pat) {
    let answer = 0;
    let lowMyString = myString.toLowerCase();
    let lowPat = pat.toLowerCase();
    if (lowMyString.includes(lowPat)) {
        answer = 1;
    } else {
        answer = 0;
        //teul
    }
    return answer;
}
