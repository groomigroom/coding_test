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
        return answer;
    }
}
