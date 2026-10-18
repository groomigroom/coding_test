import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
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
