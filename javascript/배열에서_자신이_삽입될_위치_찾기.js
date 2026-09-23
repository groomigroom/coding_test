class Main {
  public int findInsertIdx (int[] array, int data) {
    int findIdx = -1;
    for(int i = 0; i < array.length; i++) {
      if (array[i] > data) {
        findIdx = i;
        break;
      }
    }
    if (findIdx == -1) {
      return array.length;
      } else {
        return findIdx;
      }
    }

    public static void main(String[] args) {
    int[] testArray = {};

    // 1. Main 클래스의 객체(인스턴스)를 생성합니다.
    Main mainInstance = new Main();

    // 2. 생성한 객체를 통해 메서드를 호출합니다.
    int insPos = mainInstance.findInsertIdx(testArray, 55);
    System.out.println(insPos); // 출력: 0
  }
}
