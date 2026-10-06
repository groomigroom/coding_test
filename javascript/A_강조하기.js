function solution(myString) {
    let answer = '';
    return answer;
}



class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
          if (myString.charAt(i) == 'A' || myString.charAt(i) == 'a') {
            result.append(Character.toUpperCase(myString.charAt(i)));
          } else {
            result.append(Character.toLowerCase(myString.charAt(i)));
          }
        }
        return result.toString();
    }
}
