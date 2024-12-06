public class Rogue extends Adventurer {

  public Rogue(String name){
      super(name, 10);
  }

  public Rogue(String name, int hp){
    super(name, hp);
  }

  //give it a short name (fewer than 13 characters)
  public String getSpecialName() {

  }
  //accessor methods
  public int getSpecial() {

  }
  public void setSpecial(int n) {

  }
  public int getSpecialMax() {

  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other) {

  }

  //heall or buff the target adventurer
  public String support(Adventurer other) {

  }

  //heall or buff self
  public String support() {

  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {

  }
}
