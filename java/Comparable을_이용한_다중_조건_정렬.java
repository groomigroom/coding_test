public class Score implements Comparable<Score> {
  int english;
  int math;

  public Score(int english, int math) {
    this.english = english;
    this.math = math;
  }
  @Override
  public String toString() {
    return "Score{" + "english=" + english + ", math=" + math + "}";
  }
  @Override
  public int compareTo(Score o) {
    if (this.english = o.english) return o.math - this.math; 
    return o.english - this.english;
  }
}

-------------------------------------------------------------------------
//클라이언트 코드
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Score> myarr = new ArrayList<>();
    myarr.add(new Score(80, 100));
    myarr.add(new Score(100, 50));
    myarr.add(new Score(70, 100));
    myarr.add(new Score(80, 90));

    Collections.sort(myarr);
    for (Score s : myarr) {
      
    }
  }
}
