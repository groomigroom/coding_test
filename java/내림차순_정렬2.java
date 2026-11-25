import java.util.Arrays;

public class DescendingSort2 {
  public static void main(String[] args) {
    int[] A = {5, 3, 2, 4, 1};
    negate(A); //부호 반전
    Arrays.sort(A);
    negate(A); //부호 반전
    System.out.println(Arrays.toString(A));
  }
}
