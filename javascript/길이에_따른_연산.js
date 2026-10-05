function solution(num_list) {
    let answer = 0;
    let gop = 1;
    if (num_list.length >= 11) {
        for (let i = 0; i < num_list.length; i++) {
            answer += num_list[i];
        }
    } else {
            for (let i = 0; i < num_list.length; i++) {
            gop *= num_list[i];
        }
        answer = gop;
    }
    return answer;
}
