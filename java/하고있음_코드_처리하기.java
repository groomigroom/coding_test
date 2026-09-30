import java.util.*;

class Solution {
    public String solution(String code) {
        String answer = "";
        for (int idx = 0; idx < code.length(); idx++) {
          int mode;

          if (mode == 0) {
            if(code.charAt(idx) != '1' && idx % 2 == 0) {
              answer += code.charAt(idx);
            }
          } else {
            if (code.charAt(idx) != '1' && idx % 2 != 1) {
              answer += code.charAt(idx);
            }
          }

          if (code.charAt(idx) == '1') {
            if (mode == 0) {
              mode = 1;
            } else {
              mode = 0;
            }
          }

        }
        if (answer == "" ){
          return "EMPTY";
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}



https://school.programmers.co.kr/learn/courses/30/lessons/181932?language=java
