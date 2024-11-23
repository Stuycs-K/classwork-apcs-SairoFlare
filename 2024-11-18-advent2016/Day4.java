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
        ArrayList<Day4Count> letters = new ArrayList<Day4Count>();
        boolean letterFound = false;
        String room = file.nextLine();
        //System.out.println(room);
        String[] splitRoom = room.split("-");
        //System.out.println(splitRoom[0]);
        //System.out.println(splitRoom[1]);
        //System.out.println(splitRoom[2]);
        //System.out.println(splitRoom[3]);
        for (int i = 0; i < splitRoom.length - 1; i++) {
          for (int index = 0; index < splitRoom[i].length(); i++) {
            String read = splitRoom[i].substring(i, i + 1);
            for (int ind = 0; ind < letters.size(); ind++) {
              if (read.equals((letters[ind]).getLetter())) {
                letterFound = true;
              }
            }
          }
        }
      }
      return result;
    }
    catch (FileNotFoundException e) {
      System.out.println("file not found");
      return 0;
    }
  }
}
