function solution(arr) {
    let answer = [];
    for(let i = 0; i < arr.length; i++) {
        if (arr[i] >= 50 && arr[i] % 2 === 0) {
            arr[i] /= 2;
          } else if (arr[i] < 50 && arr[i] % 2 !== 0) {
            arr[i] *= 2;
          }
    }
    for (let j = 0; j < arr.length; j++) {
          answer[j] = arr[j];
        }
    return answer;
}
