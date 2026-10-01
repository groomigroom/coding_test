function solution(my_string, queries) {
    let answer = '';
    for (let i = 0; i < queries.length; i++) {
        let prefix = my_string.substring(0, queries[i][0]);

        let middle
    }
    return answer;
}




--------------------------



const middle = my_string
  .substring(queries[i][0], queries[i][1] + 1) // 1. 문자열 자르기
  .split('')                                  // 2. 글자별로 쪼개서 배열로 만들기
  .reverse()                                  // 3. 배열 뒤집기
  .join('');                                  // 4. 배열을 다시 문자열로 합치기
