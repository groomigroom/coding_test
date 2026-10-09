function solution(myString) {
    let answer = [];
    let count = 0;
    for (let i = 0; i < myString.length; i++) {
        if (myString[i] != 'x') {
            count++;
        } else {
            answer.push(count);
            count = 0;
        }
    }
    if ()
    return answer;
}
