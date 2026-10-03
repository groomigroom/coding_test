import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < answer.length; i++) {
          answer[i] = 0;
        }
        for (int j = 0; j < my_string.length(); j++) {
            char ch = my_string.charAt(j);
            
            if (ch >= 'A' && ch <= 'Z') {
                answer[ch - 'A']++;       // 대문자: 0 ~ 25
            } else if (ch >= 'a' && ch <= 'z') {
                answer[ch - 'a' + 26]++;  // 소문자: 26 ~ 51
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution uu = new Solution();
        int[] uuu = uu.solution("kimgroomi");
        System.out.println(Arrays.toString(uuu));
    }
}
