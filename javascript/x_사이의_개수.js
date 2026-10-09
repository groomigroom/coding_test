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
    if (myString[myString.length-1] == 'x') {
        answer.push(0);
    }
    if(count != 0) {
        answer.push(count);
    }
    return answer;
}
