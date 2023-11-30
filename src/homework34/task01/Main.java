package homework34.task01;

import java.util.Scanner;


public class Main {
public static String getSeasons(String input){
  switch (input){
    case "december":
    case "january":
    case "february":
      return "it is winter";

    case "march":
    case "april":
    case "may":
      return "it is spring";

    case "june":
    case "july":
    case "august":
      return "it is sommer";

    case "september":
    case "october":
    case "november":
      return "it is autumn";

  }

  return "this month does not exist";
}
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a month");
    String input= scanner.nextLine();
    System.out.println(getSeasons(input));


  }
}
