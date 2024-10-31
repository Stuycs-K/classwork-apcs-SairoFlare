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
      Scanner file = new Scanner(filename);
      int count = 0;
      while(hasNextLine())
      {

        int v0 = Interger.parseInt(file.next());
        int v1 = Interger.parseInt(file.next());
        int v2 = Interger.parseInt(file.next());
        if (v0 + v1 > v2 && v0 + v2 > v1 && v1 + v2 > v0)
        {
          count++;
        }
        file.nextLine();
      }
    }
    catch (Exception e)
    {
      System.out.println("lol");
    }



    }
  }

}
