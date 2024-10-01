public class ArrayMethods{
  /* Kevin Li kevinl687@nycstudents.net
     Selina Lin selinal50@nycstudents.net */
  public static void main(String args[]) {
    //arrToString test cases
    System.out.println("Expected [[1, 2], [3]]. Result: " + arrToString(new int [][]{{1, 2}, {3}}));
    System.out.println("Expected [[4], [5, 6]]. Result: " + arrToString(new int [][]{{4}, {5, 6}}));
    System.out.println("Expected [[-2, -3, 4], [5]]. Result: " + arrToString(new int [][]{{-2, -3, 4}, {5}}));
    System.out.println("Expected [[-1], [5], [-3], [4], [7]]. Result: " + arrToString(new int[][] {{-1}, {5}, {-3}, {4}, {7}}));
    System.out.println("Expected [[10, 15, 8, -3, 0], []]. Result: " + arrToString(new int [][]{{10, 15, 8, -3, 0}, {}}));

    //arr2DSum test cases
    System.out.println("Expected 40. Result: " + arr2DSum(new int [][]{{10, 5}, {20, 5}}));
    System.out.println("Expected -15. Result: " + arr2DSum(new int [][]{{-5, -5}, {-5}}));
    System.out.println("Expected 40. Result: " + arr2DSum(new int [][]{{10, 5}, {20, 5}}));
    System.out.println("Expected 100. Result: " + arr2DSum(new int [][]{{10}, {20}, {30}, {40}, {0}}));
    System.out.println("Expected 0. Result: " + arr2DSum(new int [][]{{0}, {}, {0}, {}, {0}}));

    //swapRC test cases
    System.out.println("Expected {{1, 2}, {3, 4}}. Result: " + swapRC(new int [][]{{1, 3}, {2, 4}}));
    System.out.println("Expected {{1, 3}, {2, 4}}. Result: " + swapRC(new int [][]{{1, 2}, {3, 4}}));
    System.out.println("Expected {{0, 0, 0, 0, 0}, {1, 1, 1, 1, 1}}. Result: " + swapRC(new int [][]{{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}}));
    System.out.println("Expected {{1, 2}}. Result: " + swapRC(new int [][]{{1}, {2}}));
    System.out.println("Expected {{1}, {2}, {3}, {4}}. Result: " + swapRC(new int [][]{{1, 2, 3, 4}}));
  }

  public static String arrToString(int[] nums) {
    String result = "[";
    for(int i = 0; i < nums.length; i++) {
      result = result + nums[i];
      if (i != nums.length - 1) {
        result = result + ", ";
      }
    }
    return result + "]";
  }

  public static String arrToString(int[][]ary){
    String result = "[";
    for(int i = 0; i <ary.length; i++) {
      result = result + arrToString(ary[i]);
      if (i != ary.length - 1) {
        result = result + ", ";
      }
    }
    return result + "]";
  }

  public static int arr2DSum(int[][]nums){
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int index = 0; index < nums[i].length; index++) {
        result += nums[i][index];
      }
    }
    return result;
  }

  public static int[][] swapRC(int[][]nums){
  return new int[1][1];
  }
}
