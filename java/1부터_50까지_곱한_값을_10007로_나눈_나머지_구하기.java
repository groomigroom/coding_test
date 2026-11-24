public class Main {
  public static void main(String[] args) throws Exception {
    long answer = 1;
    for (int i = 1; i <= 50; i++) {
      answer = answer * i;
    }
    System.out.println(answer%10007);
  }
}


---------------> 위와 같이하면 long 자료형의 범위 초과


public class Main {
  public static void main(String[] args) throws Exception {
    long answer = 1;
    for (int i = 1; i <= 50; i++) {
      answer = (answer * i)%10007;
    }
    System.out.println(answer%10007);
  }
}
