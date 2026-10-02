import java.util.*;

class Solution {
    public String[] solution(String my_string, int m, int c) {
        List<String> stringlist = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i += m){
            stringlist.add(my_string.substring(i, i+m-1));
        }
        String[] answer = stringlist.toArray(new String[0]);
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution uu = new Solution();
        String aa = uu.solution("kimgroomi", 2, 2);
        System.out.println(aa);
    }
}
