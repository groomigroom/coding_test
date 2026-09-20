import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 45, 33, 22, 234, 21, 23};
        int n = array.length;
        for(int i = 0; i < n-1; i++) {
            int tmp = 0;
            int minIdx = i;
            for(int k = i+1; k < n; k++) {
                if(array[minIdx] > array[k]) {
                    minIdx = k;
                }
            }
            tmp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = tmp;
        }
        System.out.println(Arrays.toString(array));

    }
}
