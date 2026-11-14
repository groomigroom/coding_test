function solution(arr) {
    let answer = [];
    for(let i = 0; i < arr.length; i++) {
        if (answer.size() == 0) {
            answer.add(arr[i]);
        } else if (answer.size() != 0 && answer.get(answer.size()-1) == arr[i]) {
            answer.remove(answer.size()-1);
        } else if (answer.size() != 0 && answer.get(answer.size()-1) != arr[i]) {
            answer.add(arr[i]);
        }
    }
    return answer;
}
