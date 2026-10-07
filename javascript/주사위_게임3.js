function solution(a, b, c, d) {
    let answer = 0;
    let count = [0, 0, 0, 0, 0, 0, 0];
    count[a]++;
    count[b]++;
    count[c]++;
    count[d]++;

    for (let i = 1; i <= 6; i++) {
        if (count[i] == 4) {
            return 1111 * i;
        }
    }
    return answer;
}
