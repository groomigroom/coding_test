function solution(arr) {
    let answer = [];
    for (let i = 0; i < arr.length; i++) {
        if (answer.length == 0) {
            answer.push(arr[i]);
        }
    }
    return answer;
}
