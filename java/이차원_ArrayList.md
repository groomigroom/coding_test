```java
//이차원 ArrayList 선언과 초기화
class Edge {
  int endNode;
  int value;
}
```
```java
//위 Edge 클래스를 자료형으로 하는 이차원 ArrayList를 초기화하는 방법
ArrayList<Edge> List[] = new ArrayList[10];

for (int i = 0; i < 10; i++) {
  List[i] = new ArrayList<Edge>();
}
```
```java
//그래프 데이터 저장하기
for (int i = 0; i < E; i++) {
  st = new StringTokenizer(br.readLine());
  int s = Integer.parseInt(st.nextToken());
  int e = Integer.parseInt(st.nextToken());
  int v = Integer.parseInt(st.nextToken());
  list[s].add(new Edge(e, v));
}
```
```java
//그래프 데이터 가져오기
for (int i = 0; i < list[1].size(); i++) {
  Edge tmp = list[1].get(i);
  int next = tmp.endNote;
}
```

