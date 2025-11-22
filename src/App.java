import java.util.Arrays;

public class App {

  public static Object[] rotateRight_1(Object[] arr) {
    if (arr == null) {
      System.out.println("arr is null");
      return null;
    } else {
      Object[] newArr = new Object[arr.length];
      newArr[0] = arr[arr.length - 1];
      for (int i = 0; i < arr.length - 1; i++) {
        newArr[i + 1] = arr[i];
      }
      return newArr;
    }
  }

  public static Object[] rotateRight(Object[] arr) {
    Object[] newArr = new Object[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newArr[(i + 1) % newArr.length] = arr[i];
    }
    return newArr;
  }

  public static void main(String args[]) {
    Object[] arr = new Integer[] { 1, 2, 3, 4, 5 };

    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));

    Object[] arr2 = new String[] { "Hello", "there", "my friend" };

    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}