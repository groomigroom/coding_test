const insertionSort = (ary) => {
    const n = ary.length;
    for (let end = 1; end < n; end++) {
        for (let cur = end; cur > 0; cur--) {}
            if (ary[cur-1] > ary[cur]) {
                let tmp = ary[cur-1];
                ary[cur-1] = ary[cur];
                ary[cur] = tmp;
            }
    }

    return ary
};

let dataAry = [188, 162, 168, 120, 50, 150, 177, 105]

#정렬 전
print(dataAry)
dataAry = insertionSort(dataAry)
#정렬 후
print(dataAry)

"""

[188, 162, 168, 120, 50, 150, 177, 105]
[50, 105, 120, 150, 162, 168, 177, 188]


"""

console.log("Hello, World!");
