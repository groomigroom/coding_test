class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else {
            int arr1hap = 0;
            int arr2hap = 0;
            for (int i = 0; i < arr1.length; i++) {
                arr1hap += arr1[i];
                arr2hap += arr2[i];
            }
        }
        return answer;
    }
}
