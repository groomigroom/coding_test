import java.util.*;

class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
          answer.append(Character.toUppercase(myString.charAt(i)));
        }
        return answer.toString();
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
