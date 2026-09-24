public class Main {
    public static int[] insertionSort(int[] ary) {
      int n = ary.length;
      for(int end = 1; end < n; end++) {
        for(int cur = end; cur > 0; end--) {
          if(ary[cur-1] > ary[cur]) {
            int tmp = ary[cur-1];
            ary[cur-1] = ary[cur];
            ary[cur] = tmp;
          }
        }
      }
      return ary;
    } 

    public static void main(String[] args) {
      int[] dataAry = {188, 162, 168, 120, 50, 150, 177, 105};

      //정렬 전
      System.out.println(dataAry);
      dataAry = insertionSort(dataAry);
      System.out.println(dataAry);
    }
}


/*

[188, 162, 168, 120, 50, 150, 177, 105]
[50, 105, 120, 150, 162, 168, 177, 188]


*/
