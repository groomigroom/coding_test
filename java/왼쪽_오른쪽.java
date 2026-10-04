import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> annn = new ArrayList<>();
        for(int i = 0; i < str_list.length; i++) {
          if (str_list[i] == "l") {
            for(int j = 0; j < i; j++) {
              annn.add(str_list[j]);
            }
            break;
          } else if (str_list[i] == "r") {
            for (int j = i + 1; j < str_list.length; j++) {
              annn.add(str_list[j]);
            }
          } 
        }
        String[] answer = annn.toArray();
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}
