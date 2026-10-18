function solution(num_list, n) {
    let answer = 0;
    return answer;
}

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
          if (num_list[i] == n) {
            answer = 1;
          }
        }
        return answer;
    }
}
