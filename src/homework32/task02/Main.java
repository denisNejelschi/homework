package homework32.task02;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("enter multiplication element: ");
    int number = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
      int res = number * i;
      System.out.println(number+ " X " + i + " = " + res);
      {

      }
    }
  }
}
