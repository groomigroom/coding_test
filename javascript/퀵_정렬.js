//퀵 정렬 함수 선언
function quickSort(ary) {
    let n = ary.length;
    if (n <= 1) {
        return ary;
    }

    let pivot =  ary[a / 2];
    let leftAry = [];
    let rightAry = [];
    for (let num = 0; num < n; num++) {
        if (ary[num] < pivot) {
            leftAry.push(ary[num]);
        }
    }
}
