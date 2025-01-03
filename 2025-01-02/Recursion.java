public class Recursion {
  public static void makeWords(int remainingLetters, String result, String alphabet){
    //alphabet does not have duplicate letters
    if (remainingLetters != 0) {
      for (int i = 0; i < alphabet.length(); i++) {
        makeWords(remainingLetters - 1, result + alphabet.substring(i, i + 1), alphabet);
      }
    }
    else {
      System.out.println(result);
    }
  }
}
