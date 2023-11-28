package homework33.task02;

public class Main {
  public static char[] getAlphabet(){
    char[] arr = new char[26];

    for (int i =0; i <26; i++) {
      arr[i]= (char) (i+97);

    }
    return arr;
  }

  public static void printArray(char[] arr) {
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");

  }

  public static void main(String[] args) {
   char[] array = getAlphabet();
   printArray(array);


  }

}
