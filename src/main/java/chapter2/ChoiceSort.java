package chapter2;

import java.util.ArrayList;
import java.util.List;

public class ChoiceSort {

  public static void main(String[] args) {

    List<Integer> source = new java.util.ArrayList<>(List.of(3, 7, 2, 9, 12, 31, 3, 2));
    List<Integer> target = new ArrayList<>();
    int sourceSize = source.size();
    for (int i = 0; i < sourceSize; i++) {
      int smallestIndex = findSmallestIndex(source);
      target.add(source.get(smallestIndex));
      source.remove(smallestIndex);
    }
    System.out.println("Sorted array = " + target);
  }

  private static int findSmallestIndex(List<Integer> list) {
    int smallestIndex = 0;
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) < list.get(smallestIndex)) {
        smallestIndex = i;
      }
    }
    return smallestIndex;
  }
}
