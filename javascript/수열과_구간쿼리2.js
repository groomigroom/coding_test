function solution(arr, queries) {
    let answer = [];
    for (let i = 0; i < queries.length; i++) {
        let s = queries[i][0];
        let e = queries[i][1];
        let k = queries[i][2];

        let minVal = 10000001;

        for (let idx = s; idx <= e; idx++) {
            if (arr[idx] > k && arr[idx] < minVal) {
                minVal = arr[idx];
            }
        }

        if (minVal === 10000001) {
            answer.push(-1);
        } else {
            answer.push(minVal);
        }
    }
    return answer;
}
