package homework52;

import static java.lang.Character.toUpperCase;

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

//  public static String encrypt(String text, int key) {
//    if (text == null) {
//      return null;
//    }
//    char[] arrToEncrypt = text.toCharArray();
//    int[] tempArr = new int[arrToEncrypt.length];
//    for (int i = 0; i < arrToEncrypt.length; i++) {
//      tempArr[i] = (int) arrToEncrypt[i] + key;
//    }
//    char[] encryptedArr = new char[arrToEncrypt.length];
//    for (int i = 0; i < encryptedArr.length; i++) {
//      encryptedArr[i] = (char) tempArr[i];
//    }
//    return new String(encryptedArr);
//  }
//
//
//  public static String decrypt(String data, int key) {
//    if (data == null) {
//      return null;
//    }
//    char[] arrToEncrypt = data.toCharArray();
//    int[] tempArr = new int[arrToEncrypt.length];
//    for (int i = 0; i < arrToEncrypt.length; i++) {
//      tempArr[i] = (int) arrToEncrypt[i] - key;
//    }
//    char[] encryptedArr = new char[arrToEncrypt.length];
//    for (int i = 0; i < encryptedArr.length; i++) {
//      encryptedArr[i] = (char) tempArr[i];
//    }
//    return new String(encryptedArr);
//  }

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

//  public static boolean isEmail(String text) {
//    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
//    return text.matches(emailRegex);
//  }

//  public static String reverse(String text) {
//    char[] arrToReverse = text.toCharArray();
//    int start = 0;
//    int end = arrToReverse.length - 1;
//    while (start < end) {
//      char temp = arrToReverse[start];
//      arrToReverse[start] = arrToReverse[end];
//      arrToReverse[end] = temp;
//      start++;
//      end--;
//    }
//    text = new String(arrToReverse);
//    return text;
//  }

//  public static String wordReverse(String text) {
//    String[] textArray = text.split(" ");
//    StringBuilder reversed = new StringBuilder(" ");
//    int start = 0;
//    int end = textArray.length - 1;
//    while (start < end) {
//      String temp = textArray[start];
//      textArray[start] = textArray[end];
//      textArray[end] = temp;
//      start++;
//      end--;
//    }
//    for (int i = 0; i < textArray.length; i++) {
//      reversed.append(textArray[i]).append(" ");
//    }
//    return reversed.toString();
//  }
  public static String reverceWords(String s){
    StringBuilder sb = new StringBuilder();
    String[] words = s.split(" ");
    for (int i = words.length-1; i >=0; i--) {
      sb.append(words[i]).append(" ");
    }
    return sb.toString().trim();
  }
  public static String toCamelCase(String s){
    String[] splitText = s.toLowerCase().split(" ");
    StringBuilder sb = new StringBuilder(splitText[0]);
    for (int i = 1;i< splitText.length;i++){
      sb.append(toUpperCase(splitText[i].charAt(0))).append(splitText[i].substring(1));
    }
    return sb.toString();
  }

  public static boolean isEmail(String email){
    return email.matches("[a-zA-Z0-9._]+(.\\+[a-zA-Z0-9._]+)?@[a-zA-Z0-9._]+");
  }
  public static String reverse(String s){
    return new StringBuilder(s).reverse().toString();
  }
  public boolean isPalindrome1(String s) {
    s = s.toLowerCase().replace("^[a-z]", "");
    return reverse(s).equals(s);
  }
  public static byte[] parseIP(String ip) {
    String[] bytesStr = ip.split("\\.");
    if (bytesStr.length != 4) {
      throw new IllegalArgumentException("IP should consist of 4 numbers!");
    }
    byte[] bytes = new byte[4];
    for (int i = 0; i < bytes.length; i++) {
      int val;
      try {
        val = Integer.parseInt(bytesStr[i]);

      } catch (NumberFormatException e) {
        throw new IllegalArgumentException(e);
      }
      if (val < 0 || val > 255) {
        throw new IllegalArgumentException("Numbers should be in range 0...255");

      }
      bytes[i] = (byte) (val - 128);

    }
    return bytes;

  }
  public static String encrypt(String text) {
    StringBuilder sb = new StringBuilder();
    for (char ch : text.toCharArray()) {
      sb.append((char) (ch + 3));
    }
    return sb.toString();
  }
  public static String decrypt(String data) {
    StringBuilder sb = new StringBuilder();
    for (char ch : data.toCharArray()) {
      sb.append((char) (ch -3));
    }
    return sb.toString();
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
    System.out.println(encrypt("Hello world"));
    System.out.println(decrypt(encrypt(("Hello world"))));

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
    System.out.println(reverse("I am speaking like Master Joda"));

  }
}



