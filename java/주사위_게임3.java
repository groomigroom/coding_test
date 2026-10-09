class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] count = new int[7];

        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;

        // 1. 네 개 모두 같은 경우
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 4) {
                return 1111 * i;
            }
        }

        // 2. 세 개가 같고 하나가 다른 경우
        int p = 0;
        int q = 0;

        for (int i = 1; i <= 6; i++) {
            if (count[i] == 3) {
                p = i;
            } else if (count[i] == 1) {
                q = i;
            }
        }

        if (p != 0) {
            return (10 * p + q) * (10 * p + q);
        }

        // 3. 두 개씩 같은 경우
        int first = 0;
        int second = 0;

        for (int i = 1; i <= 6; i++) {
            if (count[i] == 2) {
                if (first == 0) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        if (first != 0 && second != 0) {
            return (first + second) * Math.abs(first - second);
        }

        // 4. 한 쌍만 같고 나머지 두 개가 서로 다른 경우
        if (first != 0) {
            int q2 = 0;
            int r = 0;

            for (int i = 1; i <= 6; i++) {
                if (count[i] == 1) {
                    if (q2 == 0) {
                        q2 = i;
                    } else {
                        r = i;
                    }
                }
            }

            return q2 * r;
        }

        // 5. 네 숫자가 모두 다른 경우
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 1) {
                return i;
            }
        }

        return 0;
    }
}
