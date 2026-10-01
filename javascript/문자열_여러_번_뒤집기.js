function solution(my_string, queries) {
    let answer = '';
    for (let i = 0; i < queries.length; i++) {
        let prefix = my_string.substring(0, queries[i][0]);

        let middle = my_string
        .substring(queries[i][0], queries[i][1] + 1)
        .split('')
        .reverse()
        .join('');
    }
    return answer;
}
