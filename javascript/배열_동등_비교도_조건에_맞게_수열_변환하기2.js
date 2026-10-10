function solution(arr) {
    let arr2 = new Array(arr.length).fill(0);
    let answer = 0;
    let count = 0;
    while (true) {
        for (let j = 0; j < arr.length; j++) {
            arr2[j] = arr[j];
        }

        for (let i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                arr[i] = arr[i] * 2 + 1;
            }
        }
    }
    return answer;
}
