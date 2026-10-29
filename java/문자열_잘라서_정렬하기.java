import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> answer = new ArrayList<>();
        for(int i = 0; i < myString.length(); i++) {
            int start = 0;
            if (myString.charAt(i) == 'x') {
                answer.add(myString.substring(start, i));
                start = i + 1;
            } else if (i == myString.length()-1 && myString.charAt(i) != 'x') {
                answer.add(myString.substring(start));
            }
        }
        return answer;
    }
}
