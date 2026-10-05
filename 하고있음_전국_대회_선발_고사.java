import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int first_winner = 0;
        int second_winner = 0;
        int third_winner = 0;
        for (int i = 0; i < rank.length; i++) {
          if (rank[i] > rank[first_winner]) {
            first_winner = i;
          }
        }
        System.out.println(first_winner);
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


https://school.programmers.co.kr/learn/courses/30/lessons/181851
