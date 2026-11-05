//퀵 정렬 함수 선언
function quickSort(ary) {
    let n = ary.length;
    if (n <= 1) {
        return ary;
    }

    let pivot =  ary[n / 2];
    let leftAry = [];
    let rightAry = [];
    for (let num = 0; num < n; num++) {
        if (ary[num] < pivot) {
            leftAry.push(ary[num]);
        } else if (ary[num] > pivot) {
            rightAry.push(ary[num]);
        }
    }
    return quickSort(leftAry).concat([pivot]).concat(quickSort(rightAry));
}

//main
let dataAry = ["구름이", "비숑", "멍멍이", "친구"];
console.log(dataAry);
let sortedDataAry = quickSort(dataAry);
console.log(sortedDataAry);


------------------------------------------------------------------------------------
//역정렬
//퀵 정렬 함수 선언
function quickSort(ary) {
    let n = ary.length;
    if (n <= 1) {
        return ary;
    }

    let pivot =  ary[n / 2];
    let leftAry = [];
    let rightAry = [];
    for (let num = 0; num < n; num++) {
        if (ary[num] > pivot) {
            leftAry.push(ary[num]);
        } else if (ary[num] < pivot) {
            rightAry.push(ary[num]);
        }
    }
    return quickSort(leftAry).concat([pivot]).concat(quickSort(rightAry));
}

//main
let dataAry = ["구름이", "비숑", "멍멍이", "친구"];
console.log(dataAry);
let sortedDataAry = quickSort(dataAry);
console.log(sortedDataAry);
