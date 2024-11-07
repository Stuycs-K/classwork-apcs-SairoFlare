public class Driver {
  public static void main(String[] args) {
    Animal cat = new Animal("meow", 2, "Mittens");
    cat.speak();

    Bird b1 = new Bird("chirp", 4, "Ari", 3, "blue");
    b1.speak();
  }
}
