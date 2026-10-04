import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> annn = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
          if (finished[i] == false) {
            annn.add(todo_list[i]);
          }
        }
        String[] answer = annn.stream().toArray(String[]::new);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
