import sys

# 자릿수 제한을 해제 (0으로 설정) 또는 원하는 크기만큼 확대
sys.set_int_max_str_digits(0)

def solution(a, b):
    return str(int(a) + int(b))
