import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < answer.length; i++) {
          answer[i] = 0;
        }
        for (int j = 0; j > my_string.length(); j++) {
          answer[my_string.charAt(j) - 'a'] += 1;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution uu = new Solution();
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/181902?language=java
