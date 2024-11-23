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
      //ArrayList<String> fails = new ArrayList<String>();
      String[] columns = new String[]{"","","","","","","",""};
      while (file.hasNextLine()) {
        String line = file.nextLine();
        for (int i = 0; i < 8; i++) {
          columns[i] = columns[i] + line.substring(i, i + 1);
          //System.out.println(columns[i]);
        }
      }
      for (int i = 0; i < 8; i++) {
        String temp = "";
        int greatest = 0;
        for (int index = 0; index < columns[i].length(); index++) {
          //System.out.println(columns[i].length());
          String letter = (columns[i]).substring(index, index + 1);
          //System.out.println(letter);
        }
        //result = result + letter;
      }
      return result;
    }
    catch (FileNotFoundException e) {
      System.out.println("file not found");
      return null;
    }
  }

  public static int count(String letter, String column) {
    int result = 0;
    for (int i = 0; i < column.length(); i++) {
      if (letter.equals(column.substring(i, i + 1))) {
        result++;
      }
    }
    return result;
  }
}
