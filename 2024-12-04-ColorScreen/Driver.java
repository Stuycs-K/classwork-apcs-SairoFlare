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
    for (int i = 0; i < 80; i++) {
      Text.color(WHITE, Text.background(WHITE));
      System.out.print("+");
    }
    for (int i = 1; i < 31; i++) {
      Text.go(1, i);
      System.out.print("+");
      Text.go(81, i);
      System.out.print("+");
    }
    Text.go(30, 1);
    for (int i = 0; i < 80; i++) {
      System.out.print("+");
    }
  }
  public static void main(String[] args) {
    //System.out.println("test");
    border();
    System.out.println(RESET);
  }
}
