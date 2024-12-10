import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    boolean exit = false;
    Adventurer player = new Rogue("Player", 12);
    Adventurer enemy = new CodeWarrior("Mr. Man", 10, "java");
    Scanner userInput = new Scanner(System.in);
    //Scanner userInput = new Scanner(System.in);
    while (player.getHP() > 0 && enemy.getHP() > 0 && !exit) {
      System.out.println("Player, " + player.getHP() + "/" + player.getmaxHP() + "HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println("Mr. Man, " + enemy.getHP() + "/" + enemy.getmaxHP() + "HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String userChoice = userInput.nextLine();
      while (!(userChoice.equals("a") || userChoice.equals("attack") || userChoice.equals("sp") || userChoice.equals("special") || userChoice.equals("su") || userChoice.equals("support") || userChoice.equals("quit"))) {
        System.out.println("Invalid input, try again.");
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        userChoice = userInput.nextLine();
      }
      if (userChoice.equals("quit")) {
        exit = true;
      }
      else if (userChoice.equals("a") || userChoice.equals("attack")) {
        System.out.println(player.attack(enemy));
      }
    }
  }
}
