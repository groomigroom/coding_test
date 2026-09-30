import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ii = "";
        ii += Integer.toString(a);
        ii += Integer.toString(b);
        int ii_last = Integer.parseInt(ii);
        int ii_last2 = 2 * a * b;
        if (ii_last > ii_last2) {
          answer = ii_last;
        } else {
          answer = ii_last2;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution uu = new Solution();
        int i = uu.solution(1, 22);
        System.out.println(i);
    }
}
