import java.util.*;

class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
          if (my_string.charAt(i) == alp.charAt(0)) {
            my_string.charAt(i) = Character.toUpperCase(my_string.charAt(i));
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
