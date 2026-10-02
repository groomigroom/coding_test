import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if (i % k == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution uu = new Solution();
        int[] uuu = uu.solution(622, 3);
        System.out.println(Arrays.toString(uuu));
    }
}
