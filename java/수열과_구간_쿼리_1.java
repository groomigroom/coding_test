import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int i = 0; i < arr.length; i++) {
          for (int j = queries[i][0]; j <= queries[i][1]; j++) {
            arr[j]++;
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
