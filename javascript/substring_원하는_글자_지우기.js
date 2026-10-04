function solution(my_string, indices) {
    let answer = '';
    let toDelete = [];
    for (const idx of indices) {
        toDelete[idx] = true;
    }
    for (let i = 0; i < my_string.length; i++) {
        if (!toDelete[i]) {
            answer += my_string[i];
        }
    }
    return answer;
}
