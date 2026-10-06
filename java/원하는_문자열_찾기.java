import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        String lowMyString = myString.toLowerCase();
        String lowPat = pat.toLowerCase();

        for (int i = 0; i <= lowMyString.length() - lowPat.length(); i++) {
            boolean match = true;

            for (int j = 0; j < lowPat.length(); j++) {
                if (lowMyString.charAt(i + j) != lowPat.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return 1;
            }
        }

        return 0;
    }
}


public class Main {
    public static void main(String[] args) {
      Solution uu = new Solution();
      int result = uu.solution("aaAA", "aaaaa");
      System.out.println(result);
    }
}
