import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Set<Integer> diceSet = new HashSet<>();
        diceSet.add(a);
        diceSet.add(b);
        diceSet.add(c);
        diceSet.add(d);
        if (diceSet.size() == 1) {
          answer = 1111 * a;
        } else if (diceSet.size() == 2) {
          
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
