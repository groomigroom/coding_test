function solution(binomial) {
    let answer = 0;
    let i = 0;
    while(binomial[i] != ' ') {
        i++;
    }
    let first_number = parseInt(binomial.substring(0, i));
    binomial = binomial.substring(i + 1, binomial.length);

    let j = 0;
    

    while(binomial[j] != ' ') {
        j++;
    }
    let plMiGop = binomial[0];
    let second_number = parseInt(binomial.substring(j+1, binomial.length));
    
    
    if (plMiGop == '+') {
        answer = first_number + second_number;
    } else if (plMiGop == '-') {
        answer = first_number - second_number;
    } else {
        answer = first_number * second_number;
    }

    return answer;
}

let binomial = "32 + 3";
console.log(solution(binomial));

https://school.programmers.co.kr/learn/courses/30/lessons/181865?language=javascript
