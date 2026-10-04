import java.util.*;


class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        
        // 1. 삭제해야 할 인덱스를 체크할 배열 생성 (크기는 원래 문자열 길이)
        boolean[] toDelete = new boolean[my_string.length()];
        for (int idx : indices) {
            toDelete[idx] = true;
        }
        
        // 2. 원래 문자열을 돌면서 삭제 마크가 없는 문자만 결과에 추가
        for (int i = 0; i < my_string.length(); i++) {
            if (!toDelete[i]) {
                answer.append(my_string.charAt(i));
            }
        }
        
        return answer.toString();
    }
}


mmmmmmmmm

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for (int i = 0; i < indices.length; i++) {
          if (i > 0 && i < indices.length-1) {
            my_string = my_string.substring(0, indices[i]) + my_string.substring(indices[i + 1]);
          } else if (i == 0) {
            my_string = my_string.substring(1);
          } else {
            my_string = my_string.substring(0, indices.length-1);
          }
        }
        answer = my_string;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution uu = new Solution();
        String annn = uu.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3});
        System.out.println(annn);
    }
}


https://school.programmers.co.kr/learn/courses/30/lessons/181900?language=java
