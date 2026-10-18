function solution(arr, flag) {
    let answer = [];
    for (let i = 0; i < arr.length; i++) {
        if (flag[i] == true) {
            for (let j = 0; j < arr[i]; j++) {
                answer.push(arr[i]);
                answer.push(arr[i]);
            }
        } else {
            for (let k = 0; k < arr[i]; k++) {
                if (answer.length != 0) {
                    answer.pop();
                }
            }
        }
    }
    return answer;
}
