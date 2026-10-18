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
                    if (answer.length != 0) {
                        
                    }
                }
            }
        }
        return answer;
    }
}

def solution(arr, flag):
    answer = []
    for i in range(len(arr)):
        if flag[i] == True:
            for _ in range(arr[i]):
                answer.append(arr[i])
                answer.append(arr[i])
        else:
            for _ in range(arr[i]):
                if (len(answer) != 0):
                    answer.pop()
    return answer

print(solution([3, 2, 4, 1, 3], [True, False, True, False, False]))
