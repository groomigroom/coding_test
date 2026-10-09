import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
          if (myString.charAt(i) != 'x') {
            count++;
          } else {
            answer.add(count);
            count = 0;
          }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
