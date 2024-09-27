public class MyArrays {
  public static String arrayToString(int[] nums) {
    String result = "[";
    for (int i = 0; i < nums.length; i++) {
      result = result + nums[i];
      if (!(i == nums.length - 1)) {
        result = result + ", ";
      }
    }
    return result + "]";
  }
  public static void main(String[] args) {
    int[] array1 = new int[] {1, 2, 3, 4};
    System.out.println("Expected [1, 2, 3, 4]. Returned: " + arrayToString(array1));
    int[] array2 = new int[] {};
    System.out.println("Expected []. Returned: " + arrayToString(array2));
  }
}
