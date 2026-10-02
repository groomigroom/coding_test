import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for (int i = 0; i < is_suffix.length(); i--) {
            int count = 0;
            if (is_suffix.charAt(is_suffix.length()-1-i) == my_string.charAt(my_string.length()-1-i))
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
