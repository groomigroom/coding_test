import java.util.*;

class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
          if (myString.charAt(i) != 'A') {
            result.append(Character.toLowerCase(myString.charAt(i)));
          } else {
            result.append(myString.charAt(i));
          }
        }
        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {
      Solution uu = new Solution();
      String oo = uu.solution("KimGrroAA");
      System.out.println(oo);
    }
}


https://school.programmers.co.kr/learn/courses/30/lessons/181874?language=java#
