import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for (int i = 0; i < queries.length; i++) {
            String prefix = my_string.substring(0, queries[i][0]);

            String middle = new StringBuilder(my_string.substring(queries[i][0], queries[i][1]+1).reverse().toString());

            String suffix = my_string.substring(queries[i][1]+1);

            answer = prefix + middle + suffix;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
