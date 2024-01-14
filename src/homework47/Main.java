package homework47;

import java.util.Arrays;

public class Main {


  public static void searchPrice(Pair[] arr, String userChoise) {
    for (Pair pair : arr) {
      if (pair.getNames().equals(userChoise)) {
        System.out.println("\nPrice for " + userChoise + " is " + pair.getPrices());
        return;
      }
    }
    System.out.println("Error 404, product not found");
  }

  public static void main(String[] args) {
    String[] products = {"Apple", "Potato", "Cucumber", "Tomato", "Onion", "Grapes"};
    double[] prices = {2, 1.5, 2.5, 3, 1, 3.5};

    Pair<String, Double>[] arrSint = new Pair[6];
    for (int i = 0; i < arrSint.length; i++) {
      arrSint[i] = new Pair<>(products[i], prices[i]);
    }
    System.out.print(Arrays.toString(arrSint));
    System.out.print("\n++++++++++++++");

    searchPrice(arrSint, "Onion");
    System.out.println("--------------------");
    searchPrice(arrSint, "Cranberries");


  }
}
