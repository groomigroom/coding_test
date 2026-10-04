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
