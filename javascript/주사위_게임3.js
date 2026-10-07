function solution(a, b, c, d) {
    let answer = 0;
    let count = [0, 0, 0, 0, 0, 0, 0];
    count[a]++;
    count[b]++;
    count[c]++;
    count[d]++;

    //4개가 모두 같을 때
    for (let i = 1; i <= 6; i++) {
        if (count[i] == 4) {
            return 1111 * i;
        }
    }
    //3개가 같고 1개가 다를 때
    let p = 0;
    let q = 0;
    for(let i = 1; i <= 6; i++) {
        if (count[i] == 3) {
            p = i;
        } else if (count[i] == 1) {
            q = i;
        }
    }
    return answer;
}
