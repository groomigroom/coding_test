import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> annn = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i]; j++) {
            annn.add(arr[i]);
          }
        }
        int[] answer = annn.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
