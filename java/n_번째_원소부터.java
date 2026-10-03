import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> ann = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
            ann.add(num_list[i]);
        }
        int[] answer = ann.stream().mapToInt(Integer::intValue).toArrays();
        return answer;
    }
}
public class Main {
    public static void main(String[] args) {
        
    }
}
