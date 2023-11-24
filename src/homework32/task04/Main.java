package homework32.task04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("how long the array should be ? ");

    int[] arr = new int[scanner.nextInt()];

    for (int i = 0; i < arr.length; i++) {
      System.out.println("enter element number " + (i + 1) + " of " + arr.length);
      arr[i] = scanner.nextInt();
    }
    System.out.println("your array is ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print( arr[i] + " ");
    }
    boolean sorted = true;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        sorted = false;
        break;
      }
    }

        if (sorted) {
          System.out.print(" \nit is sorted");

        } else {
          System.out.println("\nit is unsorted");
        }
      }
    }









