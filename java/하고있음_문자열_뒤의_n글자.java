import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder ansb = new StringBuilder();
        ansb.append(my_string.substring(my_string.length()-n, my_string.length()-1));
        return ansb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
