// i have a lot of commits because i need to test on the school computers, windows powershell won't show color changes. Every time i want to test a change, i have to commit, push, and pull.
public class ColorDemo {
  /*public static void colorFore(int r, int g, int b){
    System.out.print("\u001b[38;2" + r + ";" + g + ";" + b + "m");
  }
  public static void colorBack(int r, int g, int b){
    System.out.print("\u001b[48;2" + r + ";" + g + ";" + b + "m");
  }*/
  public static void color(int foreground, int background){
    System.out.print("\u001b[" + foreground + ";" + (background + 10) + "m");
  }

  public static void main(String[] args) {
    //colorBack(10, 200, 255);
    //System.out.println("\u001b[38;2;255;0;255mPurple");
    //tries to make T piece from tetris
    System.out.print("\u001b[48;2;255;165;0m");
    System.out.print("\u001b[38;2;255;165;0m+");
    color(30, 30);
    System.out.print("--");
    color(31, 31);
    System.out.print("++");
    System.out.println("\u001b[0m");
    System.out.print("\u001b[48;2;255;165;0m");
    System.out.print("\u001b[38;2;255;165;0m+");
    color(30, 30);
    System.out.print("---");
    color(31, 31);
    System.out.print("++");
    //color(30, 30);
    //System.out.print("-");
    //color(35, 35);
    //System.out.println("+");
    System.out.print("\u001b[0m");
  }

}
