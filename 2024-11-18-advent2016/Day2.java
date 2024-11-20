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
      int x = 0;
      int y = 0;
      while (file.hasNextLine()) {
        String num = file.nextLine();
        //System.out.println(num);
        for (int i = 0; i < num.length(); i++) {
          String temp = num.substring(i, i + 1);
          if (temp.equals("U") && y <= 0) {
            y += 1;
            //System.out.println(y);
          }
        }
      }
      return result;
    }
    catch (FileNotFoundException e) {
      System.out.println("file not found");
      return new ArrayList<Integer>(1);
    }
  }
}
