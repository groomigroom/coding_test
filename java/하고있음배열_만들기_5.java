import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int iii = Integer.parseInt(intStrs[i].substring(s, s+l+1));
            if (iii > k) {
                list.add(iii);
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



https://school.programmers.co.kr/learn/courses/30/lessons/181912?language=java
