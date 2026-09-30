```java
import java.util.*;

class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;  // 시작할 때 mode는 0

        for (int idx = 0; idx < code.length(); idx++) {

            if (mode == 0) {
                if (code.charAt(idx) != '1' && idx % 2 == 0) {
                    answer += code.charAt(idx);
                }
            } else {
                if (code.charAt(idx) != '1' && idx % 2 == 1) {
                    answer += code.charAt(idx);
                }
            }

            // 현재 문자가 1이면 mode 변경
            if (code.charAt(idx) == '1') {
                if (mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            }
        }

        if (answer.equals("")) {
            return "EMPTY";
        }

        return answer;
    }
}
```


public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}



https://school.programmers.co.kr/learn/courses/30/lessons/181932?language=java
