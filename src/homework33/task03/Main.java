package homework33.task03;

import java.util.Scanner;

public class Main{

  public static int[] getFibonacci(int n) {

    int[] array = new int[n];
    array[0] = 0;
    array[1] = 1;
    for (int i = 2; i < array.length; i++) {
      array[i]= array[i-1]+array[i-2];
    }


    return array;
  }
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
  }

    public static void main (String[]args){
      System.out.println("how many numbers you need ?");
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();

      int[] fib = getFibonacci(n);
      printArray(fib);


    }
  }
