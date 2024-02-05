package homework52;

import static homework52.Main.countOccurencies;
import static homework52.Main.decrypt;
import static homework52.Main.encrypt;
import static homework52.Main.isEmail;
import static homework52.Main.isPalindrome;
import static homework52.Main.isPangram;
import static homework52.Main.reverceWords;
import static homework52.Main.reverse;
import static homework52.Main.toCamelCase;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import homework52.Main;

public class Tests {

  @Test
  void isPalindromeOrNot() {
    assertTrue(isPalindrome("TeneT"));
  }

  @Test
  void isPangramOrNot() {
    assertTrue(isPangram("The quick brown fox jumps over the lazy dog"));
    assertFalse(isPangram(" B C D E F G H I J K L M N O P Q R S T U V W X Y Z"));
  }

  @Test
  void countVerufy() {
    String blank = "Hello";
    int l = 2;
    int a = 0;
    assertEquals(l, countOccurencies(blank, 'l'));
    assertEquals(a, countOccurencies("Hello", 'a'));

  }

  @Test
  void reverceTheWord() {
    String reverced = "olleH";
    assertEquals(reverced, reverse("Hello"));
  }

  @Test
  void toCamelCaseTest() {
    String camelCase = "thisIsAnExampleOfLowerCamelCase";
    assertEquals(camelCase, toCamelCase("This is an Example of Lower camel case"));
  }

  @Test
  void isEmailOrNot() {
    assertTrue(isEmail("valyl.koval@yahoo.com"));
    assertFalse(isEmail("valyl.koval#yahoo.com"));
  }

  @Test
  void encryprDecryptTest() {
    String blank = "Hello Java";
    assertEquals(blank, decrypt(encrypt("Hello Java")));
  }
}
