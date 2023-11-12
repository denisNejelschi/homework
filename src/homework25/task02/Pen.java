package homework25.task02;

import java.util.Scanner;

public class Pen {

  int inkLevel = 1000;

  public String write() {
    Scanner s = new Scanner(System.in);
    System.out.println("enter your text");
    String line = s.nextLine();
    inkLevel -= line.length();
    if (inkLevel > line.length()) {
      System.out.println(line);
    }
    return line;
  }

  public void checkInk() {
    System.out.println( "ink Level is :" +inkLevel);

  }
  public void refill(){
          inkLevel = 1000;
    System.out.println("refill successful");
    }
  }





