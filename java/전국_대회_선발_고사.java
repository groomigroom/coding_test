import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int first_winner = -1;
        int second_winner = -1;
        int third_winner = -1;
        for (int i = 0; i < rank.length; i++) {
          if (rank[i] > first_winner) 
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      Solution uu = new Solution();
      int aaa = uu.solution(new int[] {3, 7, 2, 5, 4, 6, 1}, new boolean[] {false, true, true, true, true, false, false});
      System.out.println(aaa);
    }
}
