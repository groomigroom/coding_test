class Solution {
    public String solution(String myString, String pat) {
      StringBuilder ss = new StringBuilder();
      int index_start = 0;
        //일단 길이가 1개인지로 해서 거르기
      if (pat.length() != 1) {
        for (int i = 0; i < myString.length() - pat.length() + 2; i++) {
          if (myString.charAt(i) == pat.charAt(0)) {
            int count = 0;
            for (int j = 0; j < pat.length(); j++) {
              if (myString.charAt(i+j) == pat.charAt(j)) {
                count++;
              }
            }
            if (count == pat.length()) {
              index_start = i;
            }
          }
        }
      } else {
        for (int i = 0; i < myString.length(); i++) {
          if (myString.charAt(i) == pat.charAt(0)) {
            index_start = i;
          }
        }
      }
      for (int k = 0; k < index_start + pat.length(); k++) {
        ss.append(myString.charAt(k));
      }

      return ss.toString();
    }
}
