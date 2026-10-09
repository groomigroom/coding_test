function solution(arr) {
    let answer = [];
    let ii = -1;
    let iii = -1;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] == 2 && ii == -1) {
            ii = i;
        } else if (arr[i] == 2) {
            iii = i;
        } 
    }

    if (ii != -1 && iii != -1) {
        for (int j = ii; j <= iii; j++) {
            annn.push(arr[j]);
        }
    } else if (ii != -1 && iii == -1) {
        annn.add(2);
    } else {
        annn.add(-1);
    }
    return answer;
}
