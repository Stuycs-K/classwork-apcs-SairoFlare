import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day4 {
  public static int solver(String filename) {
    try {
      File name = new File(filename);
      Scanner file = new Scanner(name);
      int result = 0;
      while (file.hasNextLine()) {
        String room = file.nextLine();
        //System.out.println(room);
        String[] splitRoom = room.split("-");
        //System.out.println(splitRoom[0]);
        //System.out.println(splitRoom[1]);
        //System.out.println(splitRoom[2]);
        //System.out.println(splitRoom[3]);
      }
      return result;
    }
    catch (FileNotFoundException e) {
      System.out.println("file not found");
      return 0;
    }
  }
}
