import java.util.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        // 💡 문자열을 효율적으로 이어 붙이기 위해 StringBuilder를 생성합니다.
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_strings.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            
            // 💡 substring 공식을 그대로 유지하며 append로 이어 붙입니다.
            sb.append(my_strings[i].substring(s, e + 1));
        }
        
        // 최종적으로 완성된 내부 문자열을 변환하여 반환합니다.
        return sb.toString();
    }
