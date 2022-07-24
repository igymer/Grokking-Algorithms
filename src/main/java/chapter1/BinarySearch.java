package chapter1;

public class BinarySearch {

  public static void main(String[] args) {
    int[] numbers = {1, 3, 5, 7, 11};
    int sourceNum = -11;
    System.out.println(findElement(numbers, sourceNum));
  }

  private static int findElement(int[] numbers, int sourceNum) {
    int min = 0;
    int max = numbers.length - 1;

    while (max >= min) {
      int mid = (min + max) / 2;
      int guess = numbers[mid];
      if (guess == sourceNum) {
        return mid;
      } else if (guess > sourceNum) {
        max = mid - 1;
      } else {
        min = mid + 1;
      }
    }
    return -1;
  }

}
