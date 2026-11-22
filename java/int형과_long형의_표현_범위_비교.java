import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int a = 1000000000;
      a += 2000000000;
      System.out.println(a);
      //-1294967296 라는 잘못된 결과값 출력
      long b = 1000000000;
      b += 2000000000;
      System.out.println(b);
      //3000000000
    }
}
