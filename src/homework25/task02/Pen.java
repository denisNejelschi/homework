package homework25.task02;

import java.util.Scanner;

public class Pen {

  int inkLevel = 3;

  public String write() {
    Scanner s = new Scanner(System.in);
    String line = s.nextLine();
    inkLevel -= line.length();

    if (inkLevel > line.length()) {
      System.out.println(line);
    } else {
      refill();
      System.out.println("ink refill successful");
    }
    return line;
  }

  public int checkInk() {
    System.out.println();
    return inkLevel;
  }

  public void refill() {
    if (inkLevel < 0) {
      inkLevel = 1000;
    }
  }

}



