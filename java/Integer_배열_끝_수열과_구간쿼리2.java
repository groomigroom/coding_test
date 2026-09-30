import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 1. 결과를 담을 list는 처음엔 비워둡니다.
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int minVal = 1000001; // 제한사항(최대 1,000,000)보다 큰 값으로 설정
            
            // 2. 전체 배열을 도는 것이 아니라, s부터 e까지만 인덱스를 탐색합니다.
            for (int idx = s; idx <= e; idx++) {
                // k보다 크면서 현재까지 찾은 최솟값(minVal)보다 작은 경우 갱신
                if (arr[idx] > k && arr[idx] < minVal) {
                    minVal = arr[idx];
                }
            }
            
            // 3. 만약 값이 갱신되지 않았다면 조건 만족하는 값이 없으므로 -1, 있으면 최솟값 저장
            if (minVal == 1000001) {
                list.add(-1);
            } else {
                list.add(minVal);
            }
        }
        
        // List를 int[] 배열로 변환하여 반환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
