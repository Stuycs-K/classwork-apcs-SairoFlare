import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Blocks {
  public static int countBlocks(String filename) {
    try {
      File name = new File(filename);
      Scanner file = new Scanner(name);
      int horizontal = 0;
      int vertical = 0;
      int direction = 0;
      ArrayList<int[]> movements = new ArrayList<int[]>();
      movements.add(new int[]{0,0});
      while (file.hasNext()) {
        String movement = file.next();
        direction += turn(movement);
        direction = (direction + 4) % 4;
        if (direction == 0) {
          //vertical += magnitude(movement);
          //System.out.println(vertical + "vert");
        }
        else if (direction == 1) {
          //horizontal += magnitude(movement);
          //System.out.println(horizontal + "hori");
        }
        else if (direction == 2) {
          //vertical -= magnitude(movement);
          //System.out.println(vertical + "vert");
        }
        else {
          //horizontal -= magnitude(movement);
          //System.out.println(horizontal + "hori");
        }
        movements.add(new int[]{horizontal, vertical});
      }
      return Math.abs(horizontal) + Math.abs(vertical);
    }
    catch (FileNotFoundException e){
      System.out.println("file not found");
      return -1;
    }
  }

  public static int twiceCheck(ArrayList<int[]> movements, int horizontal, int vertical) {
    for (int i = 0; i < movements.size(); i++) {
      //System.out.println(horizontal + ", " + vertical);
      //System.out.println(movements.get(i)[0]);
      //System.out.println(movements.get(i)[1]);
      if (movements.get(i)[0] == horizontal && movements.get(i)[1] == vertical) {
        //System.out.println(horizontal + ", " + vertical);
        return Math.abs(horizontal) + Math.abs(vertical);
      }
    }
    return -1;
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

  public static int magnitude(String movement) {
    if (movement.length() == 2) {
      return Integer.parseInt(movement.substring(1, 2));
    }
    else {
      return Integer.parseInt(movement.substring(1, movement.length() - 1));
    }
  }
}
