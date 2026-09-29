import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer;
        Set<Integer> abcSet = new HashSet<>();
        abcSet.add(a);
        abcSet.add(b);
        abcSet.add(c);
        if (abcSet.size() == 1) {
          answer = 3 * a * 3 * a * a * 3 * a * a * a;
        } else if (abcSet.size() == 2) {
          answer = (a+b+c)*(a * a + b * b + c * c);
        } else {
          answer = a + b + c;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 1;
        Set<Integer> set = new HashSet<>();
        
    }
}
