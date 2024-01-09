package homework46;

import java.util.Scanner;

public class Main02 {

  public static void getDay(int dayNr) {
    switch (dayNr) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
    }


  }


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int dayNr;
    do {
      System.out.println(
          "enter a number 1-7, and I will provide you a day that corresponds to it. ");
      dayNr = scanner.nextInt();
    } while (dayNr < 1 || dayNr > 7);

    getDay(dayNr);

    scanner.close();
  }
}

