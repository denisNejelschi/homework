package homework42;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static Player pickClass(int pick) {
    switch (pick) {
      case 1:
        return new Mage(" ", 15, 3, 5);
      case 2:
        return new Warrior(" ", 12, 4, 4);
      case 3:
        return new Archer(" ", 15, 4);

    }
    return null;
  }

  public static void fight(Player player, Monster monster) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      player.attack(monster);
      if (!monster.isAlive()) {
        System.out.println("you won");
        break;
      }
      monster.attack((player));
      if (player.isAlive()) {
        System.out.println("you loss");

        break;
      }
      String answer = scanner.next();
      if (answer.equals("no")) {
        System.out.println("Draw");
        break;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("Choose your class");
    System.out.println("1.Mage");
    System.out.println("2.Warrior");
    System.out.println("3.Archer");
    Scanner scanner = new Scanner(System.in);
    int pick = scanner.nextInt();

    Player player = pickClass(pick);
    System.out.println("enter your name: ");
    scanner.nextLine();
    String name = scanner.nextLine();
    player.setName(name);
    Random random = new Random();
    Monster monster = new Monster(" ", random.nextInt(20) + 1, random.nextInt(20) + 1);

    System.out.println(player);
    System.out.println(monster);

    System.out.println("Fight begins! ");

    fight(player, monster);

  }

}
