import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Day6 {
  public static String solver(String filename) {
    try {
      File name = new File(filename);
      Scanner file = new Scanner(name);
      String result = "";
      ArrayList<String> fails = new ArrayList<String>();
      String[] columns = new String[]{"","","","","","","",""};
      while (file.hasNextLine()) {
        String line = file.nextLine();
        for (int i = 0; i < 8; i++) {
          columns[i] = columns[i] + line.substring(i, i + 1);
          System.out.println(columns[i]);
        }
      }
      return result;
    }
    catch (FileNotFoundException e) {
      System.out.println("file not found");
      return null;
    }
  }
}
