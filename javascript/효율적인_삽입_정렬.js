const insertionSort = (ary) => {
    n = len(ary)
    for end in range(1, n):
        for cur in range(end, 0, -1):
            if (ary[cur-1] > ary[cur]):
                ary[cur-1], ary[cur] = ary[cur], ary[cur-1]

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
