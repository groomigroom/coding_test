import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> ann = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ann.add(num_list[i]);
        }
        int[] answer = ann.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution u = new Solution();
        int[] annn = u.solution(new int[]{2, 1, 6}, 3);
        System.out.println(Arrays.toString(annn));
    }
}
