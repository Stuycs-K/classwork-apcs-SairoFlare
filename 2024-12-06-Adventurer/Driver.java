public class Driver {
  public static void main(String[] args) {
    Adventurer p1 = new Rogue("Maya", 8);
    //System.out.println(p1.getSpecialName());
    //System.out.println(p1.getSpecial());
    //System.out.println(p1.getSpecialMax());
    //p1.setSpecial(3);
    //System.out.println(p1.getSpecial());
    //System.out.println(p1.getSpecialMax());
    Adventurer p2 = new Rogue("Paul");
    //System.out.println(p2.getSpecialName());
    //System.out.println(p2.getSpecial());
    //System.out.println(p2.getSpecialMax());
    //p2.setSpecial(3);
    //System.out.println(p2.getSpecial());
    //System.out.println(p2.getSpecialMax());
    System.out.println(p1.getHP());
    System.out.println(p2.attack(p1));
    //System.out.println(p2.getSpecial());
    System.out.println(p1.getHP());
    //p1.applyDamage(4);
    //System.out.println(p1.getHP());
    System.out.println(p1.getSpecial());
    System.out.println(p2.getHP());
    System.out.println(p1.specialAttack(p2));
    System.out.println(p1.getSpecial());
    System.out.println(p2.getHP());
    System.out.println(p1.specialAttack(p2));
    System.out.println(p1.getSpecial());
    System.out.println(p1.specialAttack(p2));
    System.out.println(p1.getSpecial());
    p1.support();
    p2.support(p1);
  }
}
