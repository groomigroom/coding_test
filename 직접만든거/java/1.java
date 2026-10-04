class Solution {
public float solution (int[] check, int n, int k) {
float answer = 0;
int plus = 0;
for (int i = n; i <= k; i++) {
answer += check[i];
}
answer /= k - n + 1;
return answer;
}
}

public class Main {
public static void main(String[] args) {
Solution uu = new Solution();
float ann = uu.solution(new int[] {3, 1, 4, 5}, 1, 2);
System.out.println(ann);
}
}

mmmmmmmmmmm
자바에서 float의 출력 소수점 자리수 맞히는 법? println에서
자바에서 소수점 자리수를 맞추어 출력하려면 System.out.println() 대신 System.out.printf()나 String.format()을 사용해야 합니다. [1, 2]
1. System.out.printf() 사용하기 (가장 추천)
printf를 쓰면 서식문자(%.2f 등)를 이용해 소수점 아래 자릿수를 지정할 수 있습니다. 지정한 자리 아래에서는 자동으로 반올림됩니다. [1, 2]
java
float number = 3.141592f; // 소수점 둘째 자리까지 출력 (.2f) System.out.printf("%.2f\n", number); // 출력: 3.14 // 소수점 넷째 자리까지 출력 (.4f) System.out.printf("%.4f\n", number); // 출력: 3.1416

코드를 사용할 때는 주의가 필요합니다.
2. String.format() 후 println() 사용하기
문자열 형태로 변환해서 println으로 출력하고 싶을 때 사용합니다. [1, 2]
java
float number = 12.3456f; String result = String.format("%.2f", number); System.out.println(result); // 출력: 12.35

코드를 사용할 때는 주의가 필요합니다.
만약 반올림이 아니라 단순히 자르기(버림)를 원하시거나 다른 연산이 필요하시면 말씀해 주세요!
티스토리
[Java] 자바 소수점 원하는 자리수 만큼 출력 - 기역니은디귿 - 티스토리
단순히 println()을 사용하지 말고 printf() 메소드에서 첫 번째 인자로 몇 번째 자리까지 출력할지 정해주고 출력하는 방법이다. 이 방법은 가장 단순하...
티스토리
[Java] 실수형 출력하기 (소수점 아래 자릿수, "."으로 자르기)
2023. 1. 29. — 출력 시 소수점 자리를 맞추기 위한 가장 쉬운 방법은 printf()를 통해서 출력하는 방법입니다. 이 때 지정한 소수점 자리 아래에서 반올림이 일어납니다.
티스토리
JAVA/ Float 소수점 자리 출력 방법 - SNOWPLE - 티스토리
2015. 10. 26. — float f = 0.55555f String str = String.format("%.2f", f); System.out.println("str = " + st...
티스토리
[JAVA] float 소수점 자릿수 설정 후 String 으로 출력 하는법
2022. 9. 14. — float 를 원하는 자릿수 만큼만 소수점을 String 으로 출력하려면 아래 함수와 내부에 원하는 자릿수를 아래와 같이 입력하면 된다.(3자리)
Naver Blog
[JAVA]float 타입 소수점 자릿수 정하기 : 네이버 블로그
2015. 3. 28. — *String num = String.format("%.2f" , avg);. avg 라는 변수를 (2f) 소수점 두자리까지 출력한다. if 소수점 1자리를 원한...
AI 대답에는 오류가 있을 수 있습니다. 자세히 알아보기