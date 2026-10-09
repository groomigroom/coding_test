def solution(my_string, indices):
    answer = ''
    toDelete = [False] * len(my_string)
    for idx in indices:
        toDelete[idx] = True

    for i in range(len(my_string)):
        if not toDelete[i]:
            answer += my_string[i]
    return answer


--------------------------------------

제시하신 코드 Delete = []와 Delete[index] = True가 작동하지 않는 이유는 파이썬에서 빈 리스트([])는 존재하지 않는 인덱스에 값을 직접 할당하는 것을 허용하지 않기 때문입니다.
## ❌ 에러가 발생하는 이유 (IndexError)
Delete = []로 리스트를 생성하면 크기가 0인 빈 상태입니다. 이때 Delete[index] = True와 같이 특정 인덱스를 지정하여 값을 넣으려고 하면, 파이썬은 해당 자리를 찾지 못해 IndexError: list assignment index out of range 에러를 발생시킵니다. 파이썬 리스트는 방을 자동으로 늘려주지 않으며, 반드시 존재하는 방(인덱스)에만 값을 덮어쓸 수 있습니다.
------------------------------
## 💡 올바른 해결 방법 3가지
상황에 따라 가장 적절한 방법을 선택해 보세요.
## 1. 리스트의 크기를 미리 초기화하기 (가장 추천)
인덱스로 직접 접근하고 싶다면, 먼저 리스트의 크기를 필요한 만큼 만들어 두어야 합니다. 보통 False로 채워두고 필요한 인덱스만 True로 바꿉니다.

# 전체 데이터 개수가 10개라고 가정할 때, 10개짜리 리스트를 미리 만듭니다.max_size = 10Delete = [False] * max_size
# 이제 인덱스로 접근하여 값을 변경할 수 있습니다.for idx in indices:
    Delete[idx] = True

## 2. 딕셔너리(Dictionary) 사용하기
만약 인덱스 번호가 순차적이지 않거나(예: 5번, 100번, 10000번만 필요함), 리스트 크기를 미리 정하기 어렵다면 딕셔너리를 쓰는 것이 가장 효율적입니다.

Delete = {} # 빈 딕셔너리 생성
for idx in indices:
    Delete[idx] = True # 없는 키(Key)라도 자동으로 생성되며 저장됩니다.

## 3. 세트(Set) 사용하기
단순히 "어떤 인덱스가 삭제 대상인가?"만 기록하고 싶다면 세트를 사용하는 것이 파이썬에서 가장 빠르고 직관적입니다.

Delete = set() # 빈 세트 생성
for idx in indices:
    Delete.add(idx) # 삭제할 인덱스를 집합에 추가
# 확인할 때: if 3 in Delete: (3번 인덱스가 삭제 대상인지 확인)

------------------------------
이 코드를 활용해서 구현하려는 원래 데이터의 형태나 전체 데이터의 개수를 알려주시면, 상황에 딱 맞는 가장 효율적인 코드로 다듬어 드릴 수 있습니다. 어떤 데이터를 다루고 계시나요?

