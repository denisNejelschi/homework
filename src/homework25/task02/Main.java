package homework25.task02;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Pen pen = new Pen();
    String line;
    do {
      System.out.println("enter text");
      line = pen.write();
      System.out.println("current ink level is: " + pen.checkInk() + "/1000");
    } while (!line.equals("stop"));


  }

}
