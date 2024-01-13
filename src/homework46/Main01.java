package homework46;


import java.util.Scanner;


public class Main01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    double[] numbers = new double[1000];
    double sum = 0;
    double number = scanner.nextDouble();
   do {
      numbers[count] = number;
      count++;
      sum += number;
      number = scanner.nextDouble();
    } while (number != 0);

    double average = sum / count;
    System.out.println("Entered numbers :");
    for (int i = 0; i < count; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println("\nСреднее арифметическое: " + average);
  }
}



