function solution(a, b, c, d) {
    let answer = 0;
    let count = [0, 0, 0, 0, 0, 0, 0];
    count[a]++;
    count[b]++;
    count[c]++;
    count[d]++;

    //4개가 모두 같을 때
    for (let i = 1; i <= 6; i++) {
        if (count[i] == 4) {
            return 1111 * i;
        }
    }
    //3개가 같고 1개가 다를 때
    let p = 0;
    let q = 0;
    for(let i = 1; i <= 6; i++) {
        if (count[i] == 3) {
            p = i;
        } else if (count[i] == 1) {
            q = i;
        }
    }

    if (p != 0) {
        return (10 * p + q) * (10 * p + q);
    }

    //2개씩 같은 경우
    let first = 0;
    let second = 0;
    for(let i = 1; i <= 6; i++) {
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
        let q2 = 0;
        let r = 0;

        for (let i = 1; i <= 6; i++) {
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
    for (let i = 1; i <= 6; i++) {
        if (count[i] == 1) {
            return i;
        }
    }
    return answer;
}
