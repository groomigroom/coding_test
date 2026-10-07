class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            }  
        }
        return answer;
    }
}
