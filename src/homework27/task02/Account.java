package homework27.task02;

import java.util.Scanner;

public class Account {


  public String name;
  private String bankName;
  private final String IBAN;
  private double balance;


  public Account(String name, String bankName, String IBAN, double balance) {
    this.name = name;
    this.bankName = bankName;
    this.IBAN = IBAN;
    this.balance = balance;

  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBankName() {
    return bankName;
  }

  public String getIBAN() {
    return IBAN;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double pay() {
    Scanner scanner = new Scanner(System.in);
    double transaction = scanner.nextDouble();
    while (transaction > balance) {
      System.out.println("insufficient fund");
      break;
    }
      transaction = scanner.nextDouble();

      return balance - transaction;

  }

  public double get() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How much to get?");
    double transaction = scanner.nextDouble();
    return balance + transaction;
  }
}








