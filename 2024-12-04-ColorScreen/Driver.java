import java.util.Arrays;
public class Driver {
  //MODIFIERS
  public static final int BRIGHT = 1;
  public static final int DARK = 2;
  public static final int ITALICS = 3;
  //COLORS
  public static final int BLACK = 30;
  public static final int RED = 31;
  public static final int GREEN = 32;
  public static final int YELLOW = 33;
  public static final int BLUE = 34;
  public static final int MAGENTA = 35;
  public static final int CYAN = 36;
  public static final int WHITE = 37;
  //CONTROLS
  public static final String CLEAR_SCREEN =  "\033[2J";
  public static final String HIDE_CURSOR =  "\033[?25l";
  public static final String SHOW_CURSOR =  "\033[?25h";
  //use this to go back to normal terminal before exiting.
  public static final String RESET = "\033[0m"+SHOW_CURSOR;

  public static void border() {
    //System.out.println("test2");
    Text.go(1, 1);
    for (int i = 0; i < 80; i++) {
      Text.color(WHITE, Text.background(WHITE));
      System.out.print("+");
    }
    for (int i = 1; i < 31; i++) {
      //System.out.println("test3");
      Text.go(i, 1);
      System.out.print("+");
      Text.go(i, 81);
      System.out.print("+");
    }
    Text.go(30, 1);
    for (int i = 0; i < 80; i++) {
      System.out.print("+");
    }
  }

  public static int[] makeArray() {
    int[] result = new int[3];
    for (int i = 0; i < 3; i++) {
      result[i] = (int)(Math.random() * 100);
    }
    return result;
  }

  public static void printNums(int[] nums) {
    Text.color(WHITE, Text.background(BLACK));
    for (int i = 0; i < 3; i++) {
      if ( i == 2 && nums[i] < 10) {
        Text.go(2, 79);
      }
      else {
        Text.go(2, (i * 38) + 2);
      }
      if (nums[i] < 25) {
        Text.color(RED, BRIGHT);
        System.out.print(nums[i]);
      }
      else if (nums[i] > 75) {
        Text.color(GREEN, BRIGHT);
        System.out.print(nums[i]);
      }
      else {
        Text.color(WHITE);
        System.out.print(nums[i]);
      }
    }
  }

  public static void main(String[] args) {
    System.out.print(CLEAR_SCREEN);
    System.out.print(HIDE_CURSOR);
    //System.out.println("test");
    int[] nums = makeArray();
    //System.out.println(Arrays.toString(nums));
    border();
    printNums(nums);
    Text.go(31,1);
    System.out.println(RESET);
  }
}
