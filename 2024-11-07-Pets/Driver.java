// It didn't change anything
// The getName for the Animal class remaned the same, and Bird calls speak from the Animal superclas
// This caused the change for getName in the Bird class to not affect its speak method.
// The first two work as Bird inherits Animal
// The third doesnt work as the Animal class does not contain Bird
// The fourth works as the Bird class contains Animal
public class Driver {
  public static void main(String[] args) {
    Animal cat = new Animal("meow", 2, "Mittens");
    cat.speak();

    Bird bird1 = new Bird("chirp", 4, "Ari", 3, "blue");
    bird1.speak();

    Animal a1 = new Animal("hi", 14, "Kayle");
    Bird b1 = new Bird("hello", 23, "Kevin", 35, "white");
    //Bird b2 = new Animal("why", 2, "aaron");
    Animal a2 = new Bird("who", 352, "leo", 2, "black");
  }
}
