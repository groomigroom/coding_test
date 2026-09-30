import java.util.*;

class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 0; i < numLog.length - 1; i++) {
            if (numLog[i+1] - numLog[i] == 1) {
                answer += 'w';
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
