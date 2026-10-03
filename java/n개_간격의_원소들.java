import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List <Integer> annn = new ArrayList<>();
        for (int i = 0; i < num_list.length; i += n) {
          annn.add(num_list[i]);
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
