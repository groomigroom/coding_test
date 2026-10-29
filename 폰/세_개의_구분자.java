import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < myStr.length(); i++) {
            int count = 0;
            if (((myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') || i == myStr.length()-1 && myStr.charAt(i) != 'a' && myStr.charAt(i) != 'b' && myStr.charAt(i) != 'c') && i - count != 0) {
                //#####
                answer.add(myStr.substring(count, i));
                count = i + 1;
            }
        }
        if (answer.size() == 0) {
            answer.add("EMPTY");
        }
        
        // 3. List<Integer>를 리턴 타입인 int[] 배열로 변환합니다.
        String[] result = new String[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/181862?language=java
