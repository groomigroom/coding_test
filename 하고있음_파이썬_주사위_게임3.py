https://school.programmers.co.kr/learn/courses/30/lessons/181916?language=javascript


def solution(a, b, c, d):
  answer = 0
  count = [0, 0, 0, 0, 0, 0, 0]
  count[a] += 1
  count[b] += 1
  count[c] += 1
  count[d] += 1

  for i in range(1, 6):
    if count[i] == 4:
      return 1111 * i

  p = 0
  q = 0
  
