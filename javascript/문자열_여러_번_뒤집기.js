function solution(my_string, queries) {
    let answer = '';
    for (let i = 0; i < queries.length; i++) {
        let prefix = my_string.substring(0, queries[i][0]);

        let middle = my_string
        .substring(queries[i][0], queries[i][1] + 1)
        .split('')
        .reverse()
        .join('');

        let suffix = my_string.substring(queries[i][1]+1);

        my_string = prefix + middle + suffix;
    }
    answer = my_string;
    return answer;
}
