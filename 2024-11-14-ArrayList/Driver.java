import java.util.ArrayList;
public class Driver {
  public static void main(String[] args) {
    ArrayList<String> test = ArrayListPractice.createRandomArray(200000);
    ArrayListPractice.replaceEmpty(test);
    System.out.println(test);
  }
}
