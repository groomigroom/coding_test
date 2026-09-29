let arr = [0, 1, 2, 3, 4, 5];
let query = [4, 1, 2];

for (let i = 0; i < query.length; i++) {
    if (i % 2 === 0) {
        while (arr.length > query[i] + 1) {
            arr.pop();
        } 
    }else {
            arr.splice(0, query[i]); 
        }
}

console.log(arr);
