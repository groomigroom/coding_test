def solution(arr1, arr2):
    answer = 0
    if len(arr1) > len(arr2):
        answer = 1
    elif len(arr1) < len(arr2):
        answer = -1
    else:
        arr1hap = 0
        arr2hap = 0
    return answer

------------------

function solution(arr1, arr2) {
    let answer = 0;
    if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else {
            let arr1hap = 0;
            let arr2hap = 0;
            for (let i = 0; i < arr1.length; i++) {
                arr1hap += arr1[i];
                arr2hap += arr2[i];
            }
            if (arr1hap > arr2hap) {
                answer = 1;
            } else if (arr1hap == arr2hap) {
                answer = 0;
            } else {
                answer = -1;
            }
        }
    return answer;
}
