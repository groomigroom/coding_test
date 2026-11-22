import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int testcase = sc.nextInt();
      int answer = 0;
      int A[] = new int[100001];
      int S[] = new int[100001];
      for (int i = 1; i < 10000; i++) {
        A[i] = (int) (Math.random() * Integer.MAX_VALUE);
        S[i] = S[i - 1] + A[i];
      }
          System.out.println(cnt++);
      
    }
}
