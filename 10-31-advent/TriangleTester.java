import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester
{
  public static void main (String[] arg)
  {

  }
  public static int countTrianglesA(String filename)
  {
    try{
      File name = new File(filename);
      Scanner file = new Scanner(name);
      int count = 0;
      while(file.hasNextLine())
      {

        int v0 = Integer.parseInt(file.next());
        int v1 = Integer.parseInt(file.next());
        int v2 = Integer.parseInt(file.next());
        if (v0 + v1 > v2 && v0 + v2 > v1 && v1 + v2 > v0)
        {
          count++;
        }
        file.nextLine();
      }
      return count;
    }
    catch (FileNotFoundException e)
    {
      System.out.println("lol");
      return 0;
    }
  }
}
