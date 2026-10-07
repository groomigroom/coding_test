https://school.programmers.co.kr/learn/courses/30/lessons/181916?language=javascript


def solution(a, b, c, d):
  answer = 0
  count = [0, 0, 0, 0, 0, 0, 0]
  count[a] += 1
  count[b] += 1
  count[c] += 1
  count[d] += 1

  for i in range(1, 7):
    if count[i] == 4:
      return 1111 * i

  p = 0
  q = 0
  
  for i in range(1, 7):
    if count[i] == 3:
      p = i
    elif count[i] == 1:
      q = i

  if p != 0:
    return (10 * p + q) * (10 * p + q)

  first = 0
  second = 0
  for i in range(1, 7):
    if count[i] == 2:
      if first == 0:
        first = i
      else:
        second = i

  if first != 0 and second != 0:
    return (first + second) * abs(first - second)

  if first != 0:
    q2 = 0
    r = 0

    for i in range(1, 7):
      if count[i] == 1:
        if q2 == 0:
          q2 = i
        else:
          r = i

    return q2 * r

  for i in range(1, 7):
    if count[i] == 1:
      return i

  return answer




