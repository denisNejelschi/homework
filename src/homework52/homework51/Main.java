package homework52.homework51;

public class Main {

  public static boolean isPalindrome(String word) {
    char[] palindromeCheck = word.trim().toLowerCase().toCharArray();
    for (int i = 0; i < palindromeCheck.length / 2; i++) {
      if (palindromeCheck[i] != palindromeCheck[palindromeCheck.length - 1 - i]) {
        return false;
      }
    }
    return true;
  }
  public static boolean isPangram(String sentence) {
    sentence = sentence.toLowerCase();
    for (char letter = 'a'; letter <= 'z'; letter++) {
      if (sentence.indexOf(letter) == -1) {
        return false;
      }
    }
    return true;
  }

  public static String encrypt(String text, int key) {
    if (text == null) {
      return null;
    }
    char[] arrToEncrypt = text.toCharArray();
    int[] tempArr = new int[arrToEncrypt.length];
    for (int i = 0; i < arrToEncrypt.length; i++) {
      tempArr[i] = (int) arrToEncrypt[i] + key;
    }
    char[] encryptedArr = new char[arrToEncrypt.length];
    for (int i = 0; i < encryptedArr.length; i++) {
      encryptedArr[i] = (char) tempArr[i];
    }
    return new String(encryptedArr);
  }


  public static String decrypt(String data, int key) {
    if (data == null) {
      return null;
    }
    char[] arrToEncrypt = data.toCharArray();
    int[] tempArr = new int[arrToEncrypt.length];
    for (int i = 0; i < arrToEncrypt.length; i++) {
      tempArr[i] = (int) arrToEncrypt[i] - key;
    }
    char[] encryptedArr = new char[arrToEncrypt.length];
    for (int i = 0; i < encryptedArr.length; i++) {
      encryptedArr[i] = (char) tempArr[i];
    }
    return new String(encryptedArr);
  }

  public static int countOccurencies(String text, char letter) {
    if (text == null || text.isEmpty()) {
      return 0;
    }
    int letterCounter = 0;
    char[] temp = text.toCharArray();
    for (char c : temp) {
      if (letter == c) {
        letterCounter++;
      }
    }

    return letterCounter;
  }

  public static boolean isEmail(String text) {
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    return text.matches(emailRegex);
  }

  public static String reverse(String text) {
    char[] arrToReverse = text.toCharArray();
    int start = 0;
    int end = arrToReverse.length - 1;
    while (start < end) {
      char temp = arrToReverse[start];
      arrToReverse[start] = arrToReverse[end];
      arrToReverse[end] = temp;
      start++;
      end--;
    }
    text = new String(arrToReverse);
    return text;
  }

  public static String wordReverse(String text) {
    String[] textArray = text.split(" ");
    StringBuilder reversed = new StringBuilder(" ");
    int start = 0;
    int end = textArray.length - 1;
    while (start < end) {
      String temp = textArray[start];
      textArray[start] = textArray[end];
      textArray[end] = temp;
      start++;
      end--;
    }
    for (int i = 0; i < textArray.length; i++) {
      reversed.append(textArray[i]).append(" ");
    }
    return reversed.toString();
  }

  public static void main(String[] args) {

    System.out.println("Test palindrome");
    System.out.println(isPalindrome("Tenet"));
    System.out.println(isPalindrome("Denis"));

    System.out.println("Test pangram ");
    System.out.println(isPangram("Hello world!"));
    System.out.println(isPangram("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z"));
    System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));

    System.out.println("Test encrypt");
    System.out.println(encrypt("Hello world", 15));
    System.out.println(decrypt(encrypt(("Hello world"), 3), 3));

    System.out.println("Test letter counter ");
    System.out.println(countOccurencies("Hello world", 'l'));
    System.out.println(countOccurencies(null, 'l'));
    System.out.println(countOccurencies("Hello world", 's'));

    System.out.println("Test IsEmail");//подсмотренно
    System.out.println(isEmail("denis.nejelschi@gmail.com"));
    System.out.println(isEmail("%^123@gmail.com"));

    System.out.println("Test Reverse");
    System.out.println(reverse("Hello world, hello Java"));

    System.out.println("Test word reverse");
    System.out.println(wordReverse("I am speaking like Master Joda"));

  }
}



