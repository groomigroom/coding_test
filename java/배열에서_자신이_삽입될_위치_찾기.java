import java.util.*;

public class Main {
public int findInsertIdx (int array[], int data) {
int findIdx = -1;
for(int i = 0; i < array[].length; i++) {
if (array[i] > data) {
findIdx = i;
break;
}
}
if (findIdx == -1) {
return array[].length;
} else {
return findIdx;
}
}

public static void main(String[] args) {
int testArray[] = {};
int insPos = findInsertIdx(testArray[], 55);
System.out.println(insPos);
}
}
