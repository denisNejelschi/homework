package homework46;

import java.util.Scanner;

public class Main01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double sum = 0;
    double input;
    int i = 0;
    double[] arr = new double[1000];
    do {
      System.out.println("Enter some numbers..");
      input = scanner.nextDouble();
      arr[i] = input;
      i++;
      sum += input;
    } while (input != 0);
    for (int j = 0; j < i - 1; j++) {
      System.out.print(arr[j] + " ");
    }
    System.out.println("\naverage is : " + sum / (i - 1));
    scanner.close();
  }
}



