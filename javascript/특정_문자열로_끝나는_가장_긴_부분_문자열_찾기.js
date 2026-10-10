function solution(myString, pat) {
  let answer = "";
  let index_start = 0;
    //일단 길이가 1개인지로 해서 거르기
  if (pat.length !== 1) {
    for (let i = 0; i < myString.length - pat.length + 2; i++) {
      if (myString[i] === pat[0]) {
        let count = 0;
        for (let j = 0; j < pat.length; j++) {
          if (myString[i+j] === pat[j]) {
            count++;
          }
        }
        if (count === pat.length) {
          index_start = i;
        }
      }
    }
  } else {
    for (let i = 0; i < myString.length; i++) {
      if (myString[i] == pat[0]) {
        index_start = i;
      }
    }
  }
  for (let k = 0; k < index_start + pat.length; k++) {
    answer += myString[k];
  }

  return answer;
}
