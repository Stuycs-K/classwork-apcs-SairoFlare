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

  public static int[] returnCopy(int[] ary) {
    int[] newAry = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      newAry[i] = ary[i];
    }
    //checks to make sure they are not the same array
    if (ary != newAry) {
      return newAry;
    }
    else {
      return new int[] {-1};
    }
  }

  public static int[] concatArray(int[]ary1,int[]ary2) {
    int[] newAry = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++) {
      newAry[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++) {
      newAry[i + ary1.length] = ary2[i];
    }
    return newAry;
  }

  public static void main(String[] args) {
    // arrayToString test cases
    System.out.println("Expected [1, 2, 3, 4]. Returned: " + arrayToString(new int[] {1, 2, 3, 4}));
    System.out.println("Expected []. Returned: " + arrayToString(new int[] {}));

    //returnCopy test cases
    System.out.println("Expected [1, 2, 3, 4]. Returned: " + arrayToString(returnCopy(new int[] {1, 2, 3, 4})));
    System.out.println("Expected [10, 20, 30, 40]. Returned: " + arrayToString(returnCopy(new int[] {10, 20, 30, 40})));
    System.out.println("Expected [-10, -20, 30, 40, -50]. Returned: " + arrayToString(returnCopy(new int[] {-10, -20, 30, 40, -50})));
    System.out.println("Expected [0, -27, 15, -40, 0]. Returned: " + arrayToString(returnCopy(new int[] {0, -27, 15, -40, 0})));
    System.out.println("Expected [0]. Returned: " + arrayToString(returnCopy(new int[] {0})));
    System.out.println("Expected [-123456]. Returned: " + arrayToString(returnCopy(new int[] {-123456})));

    //concatArray test cases
    System.out.println("Expected [-12, 13, -14, 15, -16, 17]. Returned: " + arrayToString(concatArray(new int[] {-12, 13, -14}, new int[] {15, -16, 17})));
    System.out.println("Expected [0, 0]. Returned: " + arrayToString(concatArray(new int[] {0}, new int[] {0})));
    System.out.println("Expected [1, 2, 3, 4]. Returned: " + arrayToString(concatArray(new int[] {1, 2, 3}, new int[] {4})));
    System.out.println("Expected [1, 2, 3, 4]. Returned: " + arrayToString(concatArray(new int[] {1}, new int[] {2, 3, 4})));
    System.out.println("Expected [123456, -123456]. Returned: " + arrayToString(concatArray(new int[] {123456}, new int[] {-123456})));
    System.out.println("Expected [-2000, 2000, -5000]. Returned: " + arrayToString(concatArray(new int[] {-2000, 2000}, new int[] {-5000})));
  }
}
