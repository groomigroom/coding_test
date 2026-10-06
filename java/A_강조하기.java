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
      System.out.println("Hello, World!");
    }
}
