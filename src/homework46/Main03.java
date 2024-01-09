package homework46;

import java.util.Random;
import java.util.Scanner;

public class Main03 {

  public static void  fillRandomArray( int[] arr){
    Random random = new Random();
    for (int i = 0; i < arr.length ; i++) {
      arr[i] = random.nextInt(100);
    }

  }
  public static void printArr(int[]arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+ "|");
    }
  }
  public static void sortDescending(int[] arr){ //честно не сам написал. подсмотрел.
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {

        if (arr[j] < arr[j + 1]) {

          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

  }




  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("how long the array should be, enter it's length : ");
    int[] arr = new int[scanner.nextInt()];
fillRandomArray(arr);
printArr(arr);
sortDescending(arr);
    System.out.println("\nSorted :");
printArr(arr);


  }

}
