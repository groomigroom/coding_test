class Solution {
    public String solution(String my_string, int m, int c) {
        // 💡 문자열을 효율적으로 이어 붙이기 위해 StringBuilder를 사용합니다.
        StringBuilder sb = new StringBuilder();
        
        // m글자씩 건너뛰면서 반복문을 돌립니다 (i += m)
        for (int i = 0; i < my_string.length(); i += m) {
            // 💡 현재 묶음(i)에서 c번째에 있는 글자의 실제 인덱스는 'i + c - 1'입니다.
            sb.append(my_string.charAt(i + c - 1));
        }
        
        return sb.toString();
    }
}
