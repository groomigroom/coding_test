import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < is_suffix.length(); i++) {
            
            if (is_suffix.charAt(is_suffix.length()-1-i) == my_string.charAt(my_string.length()-1-i)) {
              count++;
            }
        }
        if (count == is_suffix.length()){
          answer = 1;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      Solution uu = new Solution();
      int answer = uu.solution("kimgroomi", "mi");
      System.out.println(answer);
    }
}
