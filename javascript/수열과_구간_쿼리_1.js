function solution(arr, queries) {
    for (let j = 0; j < queries.length; j++) {
        for (let i = queries[j][0]; i <= queries[j][1]; i++) {
            arr[i]++;
        }
    }
    return arr;
}
