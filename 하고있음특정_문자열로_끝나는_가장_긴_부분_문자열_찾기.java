class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int last = 0;
        for (int i = myString.length-1; i > pat.length-2; i--) {
            if (myString[i] == pat[pat.length-1]) {
                int k = 0;
                for (int L = 0; L < pat.length-1; L++) {
                    if (pat[length-1-L] == myString[i-L]) {
                        k++;
                    }
                }
                if (k ==
            }
        }
        return answer;
    }
}
