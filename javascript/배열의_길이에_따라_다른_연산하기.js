function solution(arr, n) {
    let answer = [];
    if (arr.length % 2 === 1) {
            for(let i = 0; i < arr.length; i++) {
                if (i % 2 === 0) {
                    answer[i] = arr[i] + n;
                } else {
                  answer[i] = arr[i];
                }
            }
        } else {
            for (let i = 0; i < arr.length; i++) {
                if (i % 2 === 1) {
                    answer[i] = arr[i] + n;
                } else {
                  answer[i] = arr[i];
                }
            }
        }
    return answer;
}
