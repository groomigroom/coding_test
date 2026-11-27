import java.util.Comparator;

public class ScoreComparator implements Comparator<Score> {
  @Override
  public int compare (Score o1, Score o2) {
    if (o1.math == o2.math) return o2.english - o1.english;
    return o2.math - o1.math;
  }
}

-----------------------------------------------------------
//클라이언트 코드
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Score> myarr = new ArrayList<>();
  }
}
