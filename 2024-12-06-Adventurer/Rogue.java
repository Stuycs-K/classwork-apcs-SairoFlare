public class Rogue extends Adventurer {
  private int sneak, maxSneak;


  public Rogue(String name){
      super(name);
      this.sneak = 5;
      this.maxSneak = 5;
  }

  public Rogue(String name, int hp){
    super(name, hp);
    this.sneak = 5;
    this.maxSneak = 5;
  }

  //give it a short name (fewer than 13 characters)
  public String getSpecialName() {
    return "sneak";
  }
  //accessor methods
  public int getSpecial() {
    return sneak;
  }
  public void setSpecial(int n) {
    sneak = n;
  }
  public int getSpecialMax() {
    return maxSneak;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other) {
    return "";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other) {
    return "";
  }

  //heall or buff self
  public String support() {
    return "";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    return "";
  }
}
