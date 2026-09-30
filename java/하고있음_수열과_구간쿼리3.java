import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < queries.length; i++) {
            int tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
      System.out.println(queries[1][1]);
    }
}
