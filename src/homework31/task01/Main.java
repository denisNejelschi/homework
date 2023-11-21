package homework31.task01;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);

    System.out.println("enter element a : ");
    double a = scr.nextDouble();

    System.out.println("enter element b : ");
    double b = scr.nextDouble();

    System.out.println("enter element c : ");
    double c = scr.nextDouble();

    System.out.println("enter element d : ");
    double d = scr.nextDouble();


    System.out.println((a * (b - d)) + ((c * a) / d));

  }
}

