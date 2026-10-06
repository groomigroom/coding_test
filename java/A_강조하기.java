import java.util.*;

class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
          if (myString.charAt(i) != 'A') {
            result.append(Character.toLowerCase(myString.charAt(i)));
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
