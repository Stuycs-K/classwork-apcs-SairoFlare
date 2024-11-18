import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Blocks {
  public static int countBlocks(String filename) {
    try {
      File name = new File(filename);
      Scanner file = new Scanner(name);
      int horizontal = 0;
      int vertical = 0;
      int direction = 0;
      int distance = 0;
      while (file.hasNext()) {
        String movement = file.next();
        direction += turn(movement);
      }
      return direction;
      //return distance;
    }
    catch (FileNotFoundException e){
      System.out.println("file not found");
      return -1;
    }
  }

  public static int turn(String movement) {
    String direction = movement.substring(0, 1);
    if (direction.equals("L")) {
      return -1;
    }
    else {
      return 1;
    }
  }
}
