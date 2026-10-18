import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i] == true) {
                for (int j = 0; j < arr[i]; j++) {
                    answer.add(arr[i]);
                    answer.add(arr[i]);
                }
            } else {
                for (int k = 0; k < arr[i]; k++) {
                    // 1. ArrayList의 크기는 length가 아니라 size()를 사용합니다.
                    if (answer.size() != 0) {
                        // 2. 가장 마지막 인덱스(size() - 1)의 원소를 삭제합니다.
                        answer.remove(answer.size() - 1);
                    }
                }
            }
        }
        
        // 3. List<Integer>를 리턴 타입인 int[] 배열로 변환합니다.
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}
