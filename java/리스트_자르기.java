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
        int[] answer = ann.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      Solution uu = new Solution();
      int[] newe = uu.solution(3, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
      System.out.println(Arrays.toString(newe));
    }
}
