import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> annn = new ArrayList<>();
        for (int i = 0; i < names.length; i += 5) {
            annn.add(names[i]);
        }
        String[] answer = annn.stream().toArray(String[]::new);
        return answer;
    }
}
