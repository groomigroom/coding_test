import java.util.*;

class Solution {
    public String solution(String myString, String pat) {
      StringBuilder ss = new StringBuilder();
      int index_start = 0;
      for (int i = 0; i < myString.length() - pat.length() + 2; i++) {
        if (myString.charAt(i) == pat.charAt(0)) {
          int count = 0;
          for (int j = 0; j < pat.length(); j++) {
            if (myString.charAt(i+j) == pat.charAt(j)) {
              count++;
            }
          }
          if (count == pat.length()) {
            index_start = i;
          }
        }
      }
      for (int k = 0; k < index_start + pat.length(); k++) {
        ss.append(myString.charAt(k));
      }

      return ss.toString();
    }
}

public class Main {
    public static void main(String[] args) {
      Solution uuu = new Solution();
      String uuuu = uuu.solution("AAAAaaaa", "a");
      System.out.println(uuuu);
    }
}

위에 코드가 뭐가 문제인지 인덱스 관련해서 공책에 풀어보기

https://school.programmers.co.kr/learn/courses/30/lessons/181872?language=java
