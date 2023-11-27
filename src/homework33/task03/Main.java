package homework33.task03;

import java.util.Scanner;

public class Maingit

  public static int[] getFibonacci(int n) {

    int[] array = new int[n];
    array[0] = 0;
    array[1] = 1;
    for (int i = 2; i < array.length; i++) {
      array[i]= array[i-1]+array[i-2];
    }
    for (int i = 0; i < array.length; i++)
      System.out.print(array[i] + "| ");

    return array;
  }



  public static void main(String[] args) {
    System.out.println("how many numbers you need ?");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    getFibonacci(n);

  }

}
