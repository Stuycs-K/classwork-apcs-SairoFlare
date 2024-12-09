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
    other.applyDamage(3);
    return this.getName() + " attacked " + other.getName() + " for 3 HP!";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other) {
    if (other.getSpecial() > 1) {
      other.setSpecial(other.getSpecial() - 2);
      return this.getName() + " ensnared " + other.getName() + " in a trap, and they lost 2 " + other.getSpecialName() + "!";
    }
    else {
      int oldSP = other.getSpecial();
      other.setSpecial(0);
      return this.getName() + " ensnared " + other.getName() + " in a trap, and they lost" + oldSP + " " + other.getSpecialName() + "!";
    }
  }

  //heall or buff self
  public String support() {
    int oldSneak = getSpecial();
    if (getSpecial() < 3){
      setSpecial(getSpecial() + 3);
    }
    else {
      setSpecial(5);
    }
    return getName() + " slinked into the shadows to regain " + (getSpecial() - oldSneak) + " sneak!";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    other.applyDamage(6);
    if (this.getSpecial() >= 2) {
      this.setSpecial(this.getSpecial() - 2);
      return this.getName() + " used backstab " + other.getName() + " for 6 HP!";
    }
    else {
      return "not enough sneak";
    }
  }
}
