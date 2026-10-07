class Solution {
    public String solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder();
        int last = 0;
        for (int i = myString.length-1; i > pat.length-2; i--) {
            if (myString[i] == pat[pat.length-1]) {
                int k = 0;
                for (int L = 0; L < pat.length-1; L++) {
                    if (pat[length-1-L] == myString[i-L]) {
                        k++;
                    }
                }
                if (k == pat.length) {
                    last = i;
                    for (int ii = 0; ii <= i; ii++) {
                        answer.append(myString[ii]);
                    }
                }
            }
        }
        return answer.toString();
    }
}


https://school.programmers.co.kr/learn/courses/30/lessons/181872?language=java
