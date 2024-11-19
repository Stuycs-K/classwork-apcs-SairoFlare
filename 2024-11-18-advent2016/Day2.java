import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day2 {
  public static ArrayList<Integer>solver (ArrayList<String> input) {
    try {
      File name = new File(filename);
      Scanner file = new Scanner(name);
    }
    catch (FileNotFoundException e) {
      System.out.println("file not found");
      return new ArrayList(1);
    }
  }
}
