import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> ann = new ArrayList<>();
        if (n == 1) {
          for (int i = 0; i <= slicer[1]; i++) {
            ann.add(num_list[i]);
          }
        } else if (n == 2) {
          for (int i = slicer[0]; i < num_list.length; i++) {
            ann.add(num_list[i]);
          }
        } else if (n == 3) {
          for (int i = slicer[0]; i <= slicer[1]; i++) {
            ann.add(num_list[i]);
          }
        } else if (n == 4) {
          for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
              ann.add(num_list[i]);
          }
        }
        int[] answer = ann.stream().mapToInt().
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
