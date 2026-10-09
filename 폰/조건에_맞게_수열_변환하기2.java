class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2 + 1;
            }
        }
        int small = 0;
        for (int j = 0; j < arr.length; j++) {
            
        }
        return answer;
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/181881?language=java


2중 for문 쓰면 될듯한
