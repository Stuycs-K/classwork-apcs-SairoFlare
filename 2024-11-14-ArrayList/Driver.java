import java.util.ArrayList;
public class Driver {
  public static void main(String[] args) {
    ArrayList<String> test = ArrayListPractice.createRandomArray(200000);
    //ArrayListPractice.replaceEmpty(test);
    //System.out.println(test);
    System.out.println(ArrayListPractice.makeReversedList(test));
    ArrayList<String> test2 = ArrayListPractice.createRandomArray(5);
    ArrayList<String> test3 = ArrayListPractice.createRandomArray(2);
    ArrayList<String> test4 = ArrayListPractice.createRandomArray(10);
    //System.out.println(test);
    //System.out.println(test2);
    //System.out.println(ArrayListPractice.mixLists(test, test2));
    //System.out.println(test3);
    //System.out.println(ArrayListPractice.mixLists(test, test3));
    //System.out.println(test4);
    //System.out.println(ArrayListPractice.mixLists(test, test4));
    //System.out.println(ArrayListPractice.mixLists(ArrayListPractice.createRandomArray(10000), ArrayListPractice.createRandomArray(10005)));
  }
}
