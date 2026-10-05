import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> annn = new ArrayList<>();
        int k = -1;
        int j = -1;
        for (int i = 0; i < arr.length; i++){
          if (arr[i] == 2) {
            k = i;
            break;
          }
        }
        if (k != arr.length-1 || k != -1) {
          for (int ii = k+1; ii < arr.length; ii++) {
            if (arr[ii] == 2){
              j = ii;
              break;
            }
          }
        }
        if (k == -1) {
          annn.add(-1);
        } else if (k == arr.length-1) {
          annn.add(arr[k]);
        } else {
          for (int iii = k; iii <= j; iii++) {
            annn.add(arr[iii]);
          }
        }
        int[] answer = annn.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      Solution uu = new Solution();
      int[] aaa = uu.solution({1, 2, 1, 4, 5, 2, 9});
      System.out.println(Arrays.toString(aaa));
    }
}
