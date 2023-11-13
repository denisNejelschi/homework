package homework25.task02;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Pen pen = new Pen();
    pen.write();
    pen.checkInk();
    pen.refill();
    pen.checkInk();
  }
}
