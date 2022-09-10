package chapter4;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(7, 3, 2, 5, 1, 5, 6, 0);
    List<Integer> sortedList = sort(numbers);
    System.out.println(sortedList);
  }

  private static List<Integer> sort(List<Integer> source) {
    if (source.size() <= 1) {
      return source;
    } else {
      List<Integer> lessArr = new ArrayList<>();
      List<Integer> greaterArr = new ArrayList<>();
      Integer pivot = source.get(0);
      for (int i = 1; i < source.size(); i++) {
        if (source.get(i) < pivot) {
          lessArr.add(source.get(i));
        } else {
          greaterArr.add(source.get(i));
        }
      }
      lessArr = sort(lessArr);
      lessArr.add(pivot);
      lessArr.addAll(sort(greaterArr));
      return lessArr;
    }
  }
}
