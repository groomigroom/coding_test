function solution(binomial) {
    let answer = 0;
    let i = 0;
    while(binomial[i] != ' ') {
        i++;
    }
    let first_numeber = parseInt(binomial.substring(0, i));
    binomial = binomial.substring(i + 1, binomial.length);

    let j = 0;
    console.log(binomial);

    return answer;
}

let binomial = "32 + 3";
solution(binomial);

https://school.programmers.co.kr/learn/courses/30/lessons/181865?language=javascript
