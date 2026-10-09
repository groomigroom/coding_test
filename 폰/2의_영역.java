import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> annn = new ArrayList<>();
        int ii = -1;
        int iii = -1;
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == 2 && ii == -1) {
            ii = i;
          } else if (arr[i] == 2) {
            iii = i;
          } 
        }

        if (ii != -1 && iii != -1) {
          for (int j = ii; j <= iii; j++) {
            annn.add(arr[j]);
          }
        } else if (ii != -1 && iii == -1) {
          annn.add(2);
        } else {
          annn.add(-1);
        }
        return annn.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
      Solution uu = new Solution();
      int[] solsol = uu.solution(new int[] {1, 3, 1});
      System.out.println(Arrays.toString(solsol));
    }
}
