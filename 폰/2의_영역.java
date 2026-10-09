import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int ii = -1;
        int iii = -1;
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == 2 && ii == -1) {
            ii = i;
          } else if (arr[i] == 2) {
            iii = i;
          } 
        }
    }
}

public class Main {
    public static void main(String[] args) {
      Solution uu = new Solution();
      int[] solsol = uu.solution(new int[] {1, 2, 1, 4, 5, 2, 9});
      System.out.println(Arrays.toString(solsol));
    }
}
