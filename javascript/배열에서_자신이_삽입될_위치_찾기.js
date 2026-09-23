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

    // 1. 
    // 2. 생성한 객체를 통해 메서드를 호출합니다.
    int insPos = mainInstance.findInsertIdx(testArray, 55);
    System.out.println(insPos); // 출력: 0
  }
}