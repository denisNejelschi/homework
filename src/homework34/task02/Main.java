package homework34.task02;

import java.util.Scanner;

public class Main {

  public static void getPlanet(int input) {
    for (int i = 0; i < Planets.values().length; i++) {
      if (input == i+1) {//(Planets.values()[i].getInfo())) {
        System.out.println(Planets.values()[i].getInfo());
      }
    }
  }


  public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("choose the number of the planet:");
    int  input = scanner.nextInt();
    getPlanet(input);



  }
}










