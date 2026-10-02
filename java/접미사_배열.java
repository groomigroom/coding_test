import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < my_string.length() - 1; i++) {
          String ii = my_string.substring(i, my_string.length());
          answer.add(ii);
        }
        return answer.toArray(new String[0]);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution uu = new Solution();
        String annswer = uu.solution("kimgroomi");
        System.out.println(Arrays.toString(annswer));
    }
}
