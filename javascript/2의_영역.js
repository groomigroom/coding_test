function solution(arr) {
    let answer = [];
    let ii = -1;
    let iii = -1;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === 2 && ii === -1) {
            ii = i;
        } else if (arr[i] === 2) {
            iii = i;
        } 
    }

    if (ii !== -1 && iii !== -1) {
        for (let j = ii; j <= iii; j++) {
            answer.push(arr[j]);
        }
    } else if (ii !== -1 && iii === -1) {
        answer.push(2);
    } else {
        answer.push(-1);
    }
    return answer;
}
