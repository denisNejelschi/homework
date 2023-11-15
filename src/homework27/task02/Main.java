package homework27.task02;


import java.util.Scanner;

public class Main {

  public static String changeName() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter his new name: ");
    return scanner.nextLine();
  }
  public static void main(String[] args) {
    Account account = new Account("Bill Clinton", " CommerzBank ", "DE 014578852147", 15000.0);
    System.out.println(
        account.name + "has bank account as follows: " + account.getBankName() + "IBAN "
            + account.getIBAN() + " account balance is :" + account.getBalance() + " USD");

    System.out.println("On his proper wish he changed his name to : ");
    account.setName(changeName());
    System.out.println("Enter how much did he paid for documents to change the name");
    account.setBalance(account.pay());
    System.out.println(
        "On his proper wish he changed his name to " + account.name + ", now he has  "
            + account.getBalance() + " USD");

    System.out.println("He receive some money from his aunt Polly, how much? ");
    System.out.println("now he has " + account.get() + " USD");


  }
}
