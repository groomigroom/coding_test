import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Integer[] A = {5, 3, 2, 4, 1};
    Arrays.sort(A, Collections.reverseOrder());
    System.out.println(Arrays.toString(A));
  }
}
//[5, 4, 3, 2, 1]
/*
Collection	여러 요소를 담는 자료구조의 기본 인터페이스
Collections	컬렉션을 편리하게 다루도록 돕는 유틸리티 클래스
*/
