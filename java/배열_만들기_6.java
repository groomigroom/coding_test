import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if (answer.size() == 0) {
                answer.add(arr[i]);
            } else if (answer.size() != 0 && answer[answer.size()-1] == arr[i]) {
                answer.remove(answer.size()-1);
            } else if (answer.size() != 0 && answer[answer.size()-1] != arr[i]) {
                answer.add(arr[i]);
            }
        }

        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}
