import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int gop = 1;
        if (num_list.length >= 11) {
          for (int i = 0; i < num_list.length; i++) {
            answer += num_list[i];
          }
        } else {
          for (int i = 0; i < num_list.length; i++) {
            gop *= num_list[i];
          }
          answer = gop;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
