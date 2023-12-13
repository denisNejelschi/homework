package homework38;

public class Customer extends Person {

  private double money;

  public Customer(String name, double money) {
    super(name);
    this.money = money;
  }

public boolean pay(double amount){
    if ( money<amount){
      System.out.println(" Customer : I don't hava enough money ");
      return false;

    }
  System.out.println("Customer: Sure, I pay " + amount);
    money-=amount;
    return true;
}
  public void buyProduct(Seller seller, String productName, int amount) {
    System.out.println("Customer: I want to buy " + amount + " " +  productName + " please.");
    double price = seller.getProductPrice(productName, amount);
    if (price==-1){
      return;
    }
    boolean succes = pay (price);
    if(!succes){
      return;
    }
    seller.sellProduct(productName, amount);
    System.out.println("Customer : thanks ");
  }

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }

}
