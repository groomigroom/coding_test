import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int[] arr2 = new int[arr.length];
        int count = 0;

        while (true) {
            for (int j = 0; j < arr.length; j++) {
                arr2[j] = arr[j];
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(arr, arr2)) {
                break;
            }

            count++;
        }

        return count;
    }
}
