import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> annn = new ArrayList<>();
        int ii = -1;
        int iii = -1;
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == 2 && ii == -1) {
            ii = i;
            System.out.println(ii);
          } else if (arr[i] == 2) {
            iii = i;
            System.out.println(iii);
          } 
        }
        for (int j = ii; j <= iii; j++) {
          annn.add(arr[j]);
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
      Solution uu = new Solution();
      int[] solsol = uu.solution(new int[] {1, 2, 1, 4, 5, 2, 9});
      System.out.println(Arrays.toString(solsol));
    }
}
