import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < strArr.length(); i++) {
          if (i % 2 == 0) {
            answer.append(Character.toUpperCase(strArr.charAt(i)));
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
