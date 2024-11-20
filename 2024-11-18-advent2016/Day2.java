import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day2 {
  public static ArrayList<Integer> keypadReader(String filename) {
    try {
      File name = new File(filename);
      Scanner file = new Scanner(name);
      ArrayList<Integer> result = new ArrayList<Integer>(3);
      while (file.hasNextLine()) {
        int x = 1;
        int y = 1;
        String num = file.nextLine();
        //System.out.println(num);
        for (int i = 0; i < num.length(); i++) {
          String temp = num.substring(i, i + 1);
          if (temp.equals("U") && y >= 1) {
            y -= 1;
            //System.out.println(y + "y");
          }
          else if (temp.equals("D") && y <= 1) {
            y += 1;
            //System.out.println(y + "y");
          }
          else if (temp.equals("R") && x <= 1) {
            x += 1;
            //System.out.println(x + "x");
          }
          else if (temp.equals("L") && x >= 1) {
            x -= 1;
            //System.out.println(x + "x");
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
      return new ArrayList<Integer>(1);
    }
  }

  public static int keyPress(int x, int y) {
    int[][] numpad = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
    return numpad[y][x];
  }
}
