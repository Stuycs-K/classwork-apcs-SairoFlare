public class Driver {
  public static void main(String[] args) {
    Animal cat = new Animal("meow", 2, "Mittens");
    System.out.println(cat.getAge());
    System.out.println(cat.getName());
    System.out.println(cat.getNoise());
  }
}
