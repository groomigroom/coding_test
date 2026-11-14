import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++ ) {
            if (answer.size() == 0) {
                answer.add(arr[i])
            }
        }
        return answer;
    }
}
