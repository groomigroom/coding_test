import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            int iii = Integer.parseInt(intStrs[i].substring(s, s+l));
            if (iii > k) {
                list.add(iii);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution uu = new Solution();
        System.out.println(Arrays.toString(uu.solution(new String[] {"0123456789","9876543210","9999999999999"}, 50000, 5, 5)));
    }
}
