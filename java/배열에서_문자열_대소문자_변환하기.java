class Solution {
    public String[] solution(String[] strArr) {
        // 💡 1. 결과를 담을 원본 배열과 똑같은 크기의 새 String 배열을 생성합니다.
        String[] answer = new String[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                // 💡 2. 짝수 인덱스는 문자열 전체를 한 번에 소문자로 변환하여 넣습니다.
                // (문제 조건: 0번을 포함한 짝수 인덱스는 소문자로 변환)
                answer[i] = strArr[i].toLowerCase();
            } else {
                // 💡 3. 홀수 인덱스는 문자열 전체를 한 번에 대문자로 변환하여 넣습니다.
                answer[i] = strArr[i].toUpperCase();
            }
        }
        
        // 💡 4. 선언과 일치하는 String[] 타입을 정상적으로 리턴합니다.
        return answer;
    }
}
