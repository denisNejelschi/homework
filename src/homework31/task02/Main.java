package homework31.task02;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int dice1;
    int dice2;
    int howManyDice;
    do {
      System.out.println(" How many dice you need 1 or 2 ?  enter 3 to stop the game");
      howManyDice = scanner.nextInt();

      if (howManyDice == 1) {
        dice1 = 1 + random.nextInt(6);
        System.out.println("your number is: " + dice1);
      }
      if (howManyDice == 2) {
        dice1 = 1 + random.nextInt(6);
        dice2 = 1 + random.nextInt(6);
        System.out.println("your numbers are: " + dice1 + " | " + dice2);
      }
    }
    while (howManyDice != 3);

  }


}



