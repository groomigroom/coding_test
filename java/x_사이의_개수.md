```java
import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
          if (myString.charAt(i) != 'x') {
            count++;
          } else {
            answer.add(count);
            count = 0;
          }
        }
        if (myString.charAt(myString.length()-1) == 'x') {
          answer.add(0);
        }
        if (count != 0) {
          answer.add(count);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
      Solution uu = new Solution();
      int[] annn = uu.solution("xabcxdefxghi");
      System.out.println(Arrays.toString(annn));
    }
}
```
