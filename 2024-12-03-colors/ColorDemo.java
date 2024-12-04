public class ColorDemo {
  public static void colorFore(int r, int g, int b){
    System.out.print("\u001b[38;2" + r + ";" + g + ";" + b + "m");
  }
  public static void colorBack(int r, int g, int b){
    System.out.print("\u001b[48;2" + r + ";" + g + ";" + b + "m");
  }
  public static void color(int foreground, int background){
    System.out.print("\u001b[" + foreground + ";" + background + "m");
  }

  public static void main(String[] args) {
    //colorBack and colorFore don't work, fix later
    colorBack(10, 200, 255);
    System.out.println("Blue/Green");
    color(30, 31);
    System.out.println("Hi");
    System.out.println("\u001b[0m");
  }

}
