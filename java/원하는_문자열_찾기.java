import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int count = 0;
        String lowMyString = myString.toLowerCase();
        String lowPat = pat.toLowerCase();
        for (int i = 0; i < lowMyString.length(); i++) {
          if (lowMyString.charAt(i) == lowPat.charAt(0)) {
            for (int j = 0; j < lowPat.length(); j++) {
              
              if (lowMyString.charAt(i+j) == lowPat.charAt(j)) {
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
