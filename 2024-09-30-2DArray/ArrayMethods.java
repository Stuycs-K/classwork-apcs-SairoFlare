public class ArrayMethods{
  /* Kevin Li kevinl687@nycstudents.net
     Selina Lin selinal50@nycstudents.net */
  public static void main(String args[]) {
    //arrToString test cases
    System.out.println("Expected [[1, 2], [3]]. Returned:" + arrToString(new int[][]{{1,2}, {3}}));
    System.out.println("Expected [[4], [5, 6]]. Returned: " + arrToString(new int[][]{{4}, {5,6}}));
    System.out.println("Expected [[-2, -3, 4], [5]]. Returned: " + arrToString(new int[][]{{-2,-3,4}, {5}}));
    System.out.println("Expected [[-2, -3], [4, 5]]. Returned: " + arrToString(new int[][]{{-2,-3}, {4,5}}));
    System.out.println("Expected [[-1], [5], [-3], [4], [7]]. Returned: " + arrToString(new int[][]{{-1}, {5}, {-3}, {4}, {7}}));
    System.out.println("Expected [[10, 15, 8, -3, 0], []]. Returned: " + arrToString(new int[][]{{10, 15, 8, -3, 0}, {}}));

    //arr2DSum test cases
    System.out.println("Expected 40. Returned: " + arr2DSum(new int[][]{{10,5},{20,5}}));
    System.out.println("Expected -15. Returned: " + arr2DSum(new int[][]{{-5,-5},{-5}}));
    System.out.println("Expected 40. Returned: " + arr2DSum(new int[][]{{10,5},{20,5}}));
    System.out.println("Expected 40. Returned: " + arr2DSum(new int[][]{{10,5},{20,5}}));
    System.out.println("Expected 40. Returned: " + arr2DSum(new int[][]{{40,0},{}}));
    System.out.println("Expected 40. Returned: " + arr2DSum(new int[][]{{10,15},{20,-5}}));
    System.out.println("Expected 40. Returned: " + arr2DSum(new int[][]{{15},{5},{20}}));

    //replaceNegative test cases
    System.out.print("Expected [[1, 0, 10], [0, 1, 11], [0, 12, 1]]. Returned: ");
    replaceNegative(new int[][] {{-2, -2, 10}, {-3, -3, 11}, {-4, 12, -4}});
    System.out.print("Expected [[11, 0, 0], [0, 11, 0]]. Returned: ");
    replaceNegative(new int[][] {{11, -20, -10}, {-10, 11, -11}});
    System.out.print("Expected [[1, 0], [0, 1, 0], [0, 0, 1], [0, 0, 0, 1]]. Returned: ");
    replaceNegative(new int[][] {{-2, -2}, {-2, -2, -2}, {-2, -2, -2}, {-2, -2, -2, -2}});
    System.out.print("Expected [[1], [2], [3], [4], [5]]. Returned: ");
    replaceNegative(new int[][] {{1}, {2}, {3}, {4}, {5}});
    System.out.print("Expected [[2], [0, 1, 11, 15, 20, 25, 0, 0, 0]]. Returned: ");
    replaceNegative(new int[][] {{2}, {-5, -10, 11, 15 ,20, 25, -30, -40, -50}});
    System.out.print("Expected [[1], []]. Returned: ");
    replaceNegative(new int[][] {{-4}, {}});

    //replaceNegative test cases
    System.out.println("Expected [[1, 2], [3]]. Returned:" + arrToString(copy(new int[][]{{1,2}, {3}})));
    System.out.println("Expected [[1, 2, 3], [], [], [], [1, 2, 3]]. Returned:" + arrToString(copy(new int[][]{{1,2, 3}, {}, {}, {}, {1, 2, 3}})));
    System.out.println("Expected [[-3, -2, -1, 0], [0], [1, 2, 3]]. Returned:" + arrToString(copy(new int[][]{{-3 , -2, -1 ,0}, {0}, {1, 2, 3}})));
    System.out.println("Expected [[5134124]]. Returned:" + arrToString(copy(new int[][]{{5134124}})));
    System.out.println("Expected [[], [432, 234, 342], []]. Returned:" + arrToString(copy(new int[][]{{}, {432, 234, 342}, {}})));
    System.out.println("Expected [[]]. Returned:" + arrToString(copy(new int[][]{{}})));
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

  public static String arrToString(int[][] ary){
  //this should use arrToString(int[])
	String result = "[";
	for (int i = 0; i < ary.length;i++) {
		result += arrToString(ary[i]);
		if (i != ary.length - 1) {
			result += ", ";
		}
	}
	return result + "]";
  }

  public static int arr2DSum(int[][]nums){
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
		for (int j = 0; j < nums[i].length; j++) {
			sum += nums[i][j];
		}
	}
	return sum;
  }

  public static void replaceNegative(int[][] vals) {
    for(int i = 0; i < vals.length; i++){
      for(int j = 0; j < vals[i].length; j++) {
        if (vals[i][j] < 0) {
          if (i == j) {
            vals[i][j] = 1;
          } else {
            vals[i][j] = 0;
          }
        }
      }
    }
    System.out.println(arrToString(vals));
  }

  public static int[] copy(int[] nums){
    int[] result = new int[nums.length];
    for (int i = 0; i <nums.length; i++) {
      result[i] = nums[i];
    }
    return result;
  }
  public static int[][] copy(int[][] nums){
    int[][] result = new int[nums.length][];
    for (int i = 0; i < nums.length; i++) {
      result[i] = copy(nums[i]);
    }
    return result;
  }
 }
