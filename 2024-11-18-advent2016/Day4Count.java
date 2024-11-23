public class Day4Count {
  private String letter;
  private int count;
  public Day4Count(String input) {
    letter = input;
    count = 1;
  }

  public String getLetter() {
    return letter;
  }
  public int getCount() {
    return count;
  }
  public void addCount() {
    count++;
  }
}
