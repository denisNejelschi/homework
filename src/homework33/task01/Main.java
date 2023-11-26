package homework33.task01;

public class Main {
  public static int[] invertArrayNumbers(int[]arr){
    for (int i = 0; i < arr.length; i++) {
      arr[i]=-arr[i];
    }
    return arr;
  }
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");

  }

  public static void main(String[] args) {
    int[] arr={4,-4,6,-8,0,47,1,-3};
    printArray(invertArrayNumbers(arr));

  }


}
