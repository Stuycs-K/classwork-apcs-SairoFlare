import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day2 {
  public static ArrayList<String> keypadReader(String filename) {
    try {
      File name = new File(filename);
      Scanner file = new Scanner(name);
      ArrayList<String> result = new ArrayList<String>(3);
      while (file.hasNextLine()) {
        int x = 0;
        int y = 2;
        String num = file.nextLine();
        //System.out.println(num);
        for (int i = 0; i < num.length(); i++) {
          String temp = num.substring(i, i + 1);
          if (temp.equals("U") && y != 0 && !(y == 1 && (x == 1 || x == 3)) && !(y == 2 && (x == 0 || x == 4))) {
            y -= 1;
            //System.out.println("U");
            //System.out.println(x + "x, " + y + "y");
          }
          else if (temp.equals("D") && y != 4 && !(y == 3 && (x == 1 || x == 3)) && !(y == 2 && (x == 0 || x == 4))) {
            y += 1;
            //System.out.println("D");
            //System.out.println(x + "x, " + y + "y");
          }
          else if (temp.equals("R") && x != 4 && !(x == 3 && (y == 1 || y == 3)) && !(x == 2 && (y == 0 || y == 4))) {
            x += 1;
            //System.out.println("R");
            //System.out.println(x + "x, " + y + "y");
          }
          else if (temp.equals("L") && x != 0 && !(x == 1 && (y == 1 || y == 3)) && !(x == 2 && (y == 0 || y == 4))) {
            x -= 1;
            //System.out.println("L");
            //System.out.println(x + "x, " + y + "y");
          }
        }
        //System.out.println(x + "x");
        //System.out.println(y + "y");
        result.add(keyPress(x, y));
      }
      return result;
    }
    catch (FileNotFoundException e) {
      System.out.println("file not found");
      return new ArrayList<String>(1);
    }
  }

  public static String keyPress(int x, int y) {
    String[][] numpad = new String[][]{{null,null,"1",null,null}, {null,"2","3","4",null}, {"5","6","7","8","9"}, {null,"A", "B", "C",null}, {null,null,"D",null,null}};
    return numpad[y][x];
  }
}
