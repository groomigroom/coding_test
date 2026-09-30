function solution(code) {
    let answer = '';
    let mode = 0;
    for (let idx = 0; idx < code.length; idx++) {
        if (mode === 0) {
            if (code[idx] !== '1' && idx % 2 === 0) {
                answer += code[idx];
            } else {
                if (code[idx] !== '1' && idx % 2 === 1) {
                    answer += code[idx];
                }
            }
            if (code[idx] === '1') {
                if (mode === 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            }
        }
        if (answer === "") {
            return "EMPTY";
        }
        
    }
    return answer;
}
