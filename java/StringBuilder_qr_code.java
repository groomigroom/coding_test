import java.util.*;

class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sbb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                sbb.append(code.charAt(i));
            }
        }
        String answer = sbb.toString();
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
