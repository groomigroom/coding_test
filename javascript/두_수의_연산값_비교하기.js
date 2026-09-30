function solution(a, b) {
    let answer = 0;
    let ii = "";
    ii += a;
    ii += b;
    let ii_last = parseInt(ii);
    let ii_last2 = 2 * a * b;
    if (ii_last > ii_last2) {
          answer = ii_last;
        } else {
          answer = ii_last2;
        }
    return answer;
}
