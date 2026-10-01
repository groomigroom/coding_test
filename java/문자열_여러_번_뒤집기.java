class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for (int i = 0; i < queries.length; i++) {
            String prefix = my_string.substring(0, queries[i][0]);

            String middle = new StringBuilder(my_string.substring(queries[i][0], queries[i][1]+1)).reverse().toString();

            String suffix = my_string.substring(queries[i][1]+1);

            my_string = prefix + middle + suffix;
        }
        answer = my_string;
        return answer;
    }
}
