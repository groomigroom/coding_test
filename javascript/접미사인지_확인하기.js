function solution(my_string, is_suffix) {
    let answer = 0;
    let count = 0;

    if (is_suffix.length > my_string.length) {
        return 0;
    }
    
    for(let i = 0; i < is_suffix.length; i++) {
        if (is_suffix[is_suffix.length-1-i] === my_string[my_string.length-1-i]) {
            count++;
        }
    }
    if (count === is_suffix.length) {
        answer = 1;
    }
    return answer;
