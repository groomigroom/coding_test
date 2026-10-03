import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for (int i = 0; i < indices.length; i++) {
          if (i > 0 && i < indices.length-1) {
            my_string = my_string.substring(0, indices[i]) + my_string.substring(indices[i + 1]);
          }
        }
        answer = my_string;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution uu = new Solution();
        String annn = uu.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3});
        System.out.println(annn);
    }
}
