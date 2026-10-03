import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for (int i = 0; i < indices.length; i++) {
          my_string = my_string.substring(0, indices[i]) + my_string.substring(indices[i + 1]);
        }
        answer = my_string;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
