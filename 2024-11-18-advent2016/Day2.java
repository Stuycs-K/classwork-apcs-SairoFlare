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
        int y = 3;
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
      return new ArrayList<String>(1);
    }
  }

  public static String keyPress(int x, int y) {
    String[][] numpad = new String[][]{{"1"}, {"2","3","4"}, {"5","6","7","8","9"}, {"A", "B", "C"}, {"D"}};
    return numpad[y][x];
  }
}
