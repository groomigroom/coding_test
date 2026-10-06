import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int count = 0;
        String 
        for (int i = 0; i < myString.length(); i++) {
          if (myString.charAt(i) == pat.charAt(0)) {
            for (int j = 0; j < pat.length(); j++) {
              
              if (myString.charAt(i+j) == pat.charAt(j)) {
                count++;
              }
            }
          }
        }
        if (count == pat.length()) {
          answer = 1;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      Solution uu = new Solution();
      int result = uu.solution("AbCdEfG", "aBc");
    }
}
