function solution(num_list) {
    let answer = 0;
    let hol = "";
    let jjak = "";
    for (let i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                jjak += num_list[i];
            } else {
                hol += num_list[i];
            }
        }
answer = parseInt(jjak) + parseInt(hol);

    return answer;
}