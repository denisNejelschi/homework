package homework32.task03;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
    System.out.println("enter a random number from 1 to 10(inclusive)");
    int number = scr.nextInt();
    if (number >= 1 && number <= 10) {
      System.out.println("You entered " + number + "." + "Thank you!");
    }
    while (number <= 1 || number >= 10) {
      System.out.println("enter a random number from 1 to 10(inclusive)");
      number = scr.nextInt();
      if (number >= 1 && number <= 10) {
        System.out.println("You entered " + number + "." + "Thank you!");
      }
    }
  }
}
