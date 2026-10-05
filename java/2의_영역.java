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
        if (k != arr.length-1) {
          for (int ii = k+1; ii < arr.length; ii++) {
            if (arr[ii] == 2){
              j = ii;
              break;
            }
          }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
