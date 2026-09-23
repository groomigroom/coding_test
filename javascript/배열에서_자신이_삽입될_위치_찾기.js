const findInsertIdx = (array, data) => {
    let findIdx = -1;
    for(let i = 0; i < array.length; i++) {
      if (array[i] > data) {
        findIdx = i;
        break;
      }
    }
    if (findIdx == -1) {
      return array.length;
      } else {
        return findIdx;
    }
};
    

    
let testArray = [];

let insPos = findInsertIdx(testArray, 55);
console.log(insPos); // 출력: 0
