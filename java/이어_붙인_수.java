class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String hol = "";
        String jjak = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                jjak += num_list[i];
            } else {
                hol += num_list[i];
            }
        }
        answer = Integer.parseInt(jjak) + Integer.parseInt(hol);

        return answer;
    }
}

class Main {
    public static void main() {
        int[] num_list = {1, 2, 3, 4, 5};
        Solution sol = new Solution();
        int answer = sol.solution(num_list);
        System.out.println(answer);
    }
}

//135 + 24 = 159