function solution(myString, pat) {
    let answer = 0;
    for(let i = 0; i < myString.length - pat.length + 1; i++) {
        let count = 0;
        if (myString[i] === pat[0]) {
            for(let j = 0; j < pat.length; j++) {
                if (myString[i+j] === pat[j]) {
                    count++;
                }
            }
            if (count === pat.length) {
                answer++;
            }
            count = 0;
        }
    }
    return answer;
}
