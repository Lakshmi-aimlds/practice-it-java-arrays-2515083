import java.util.Arrays;

public class App {

  public static Integer findSecondSmallestItem_1(Integer[] arr) {
    if (arr.length <= 1) {
      return null;
    }
    // sort the array
    Arrays.sort(arr);

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        return arr[i + 1];
      }
    }
    return null;
  }

  public static Integer findSecondSmallestItem(Integer[] arr) {

    int min = Integer.MAX_VALUE;
    int sec_min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      int curr = arr[i];
      if (curr < min) {
        sec_min = min;
        min = curr;
      } else if (curr < sec_min && curr != min) {
        sec_min = curr;
      }
    }
    if (sec_min == Integer.MAX_VALUE) {
      return null;
    }

    return sec_min;
  }

  public static void main(String args[]) {
    Integer[] arr = new Integer[] { 5, 8, 3, 2, 6 };
    System.out.println(findSecondSmallestItem(arr));

    Integer[] arr2 = new Integer[] { 3, 8, 5, 2, 6 };
    System.out.println(findSecondSmallestItem(arr2));

    Integer[] arr3 = new Integer[] { 6, 8, 5, 2, 3 };
    System.out.println(findSecondSmallestItem(arr3));

    Integer[] arr4 = new Integer[] { 3, 3, 3, 3, 3 };
    System.out.println(findSecondSmallestItem(arr4));

    Integer[] arr5 = new Integer[] { 3, 3, 3, 2, 3 };
    System.out.println(findSecondSmallestItem(arr5));

    Integer[] arr6 = new Integer[] { 3, 4, 3, 3, 3 };
    System.out.println(findSecondSmallestItem(arr6));

    Integer[] arrEmpty = new Integer[] {};
    System.out.println(findSecondSmallestItem(arrEmpty));

    Integer[] arrOne = new Integer[] { 1 };
    System.out.println(findSecondSmallestItem(arrOne));
  }
}