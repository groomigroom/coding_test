function solution(arr, queries) {
    let answer = [];
    for(let i = 0; i < queries.length; i++) {
        let tmp = arr[queries[i][0]];
        arr[queries[i][0]] = arr[queries[i][1]];
        arr[queries[i][1]] = tmp;
    }
    for (let k = 0; k < arr.length; k++) {
        answer[k] = arr[k];
    }
    return answer;
}
