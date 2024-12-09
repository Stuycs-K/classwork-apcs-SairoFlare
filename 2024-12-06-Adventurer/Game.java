import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    boolean exit = false;
    Adventurer player = new Rogue("Player", 12);
    Adventurer enemy = new CodeWarrior("Mr. Man", 10, "java");
    //Scanner userInput = new Scanner(System.in);
    while (player.getHP() > 0 && enemy.getHP() > 0 && !exit) {
      System.out.println("Player, " + player.getHP() + "/" + player.getmaxHP() + "HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println("Mr. Man, " + enemy.getHP() + "/" + enemy.getmaxHP() + "HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      Scanner userInput = new Scanner(System.in);
      exit = true;
    }
  }
}
