import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
      for (int j = 0; j < queries.length; j++) {
        for (int i = queries[j][0]; i <= queries[j][1]; i++) {
          arr[i]++;
        }
      }
      return arr;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
