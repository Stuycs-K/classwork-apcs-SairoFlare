import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day3 {
  public static int solver(String filename) {
    try {
      File name = new File(filename);
      Scanner file = new Scanner(name);
      int result = 0;
      while (file.hasNextLine()) {
        
      }
      return result;
    }
    catch (FileNotFoundException e) {
      System.out.println("file not found");
      return 0;
    }
  }
}
