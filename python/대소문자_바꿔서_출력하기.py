str = input()
result = ""

for i in str:
    if i.isupper():          # 올바른 메서드: isupper(), 중괄호 대신 콜론(:)
        result += i.lower()  # 올바른 메서드: lower()
    else:                    # else 뒤에 콜론(:)
        result += i.upper()  # 올바른 메서드: upper()

print(result)
