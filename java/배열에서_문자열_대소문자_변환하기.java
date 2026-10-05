import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
          if (i % 2 == 0) {
            for (int j = 0; j < strArr[i].length(); j++) {
              answer.append(Character.toUpperCase(strArr[i].charAt(j)));
            }
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
