package homework27.task02;

import javax.sound.midi.Soundbank;

public class Main {

  public static void main(String[] args) {
    Account account = new Account("Bill Clinton", " CommerzBank ", "DE 014578852147", 1500.0,
        -1000.0);
    System.out.println(account.name + " has account in " + account.getBankName() + " his IBAN is "
        + account.getIBAN() + " he has now  " + account.getAccountStatus()
        + "but his credit limit is " + account.getCreditLimit());
    System.out.println(
        "Bill is dead. His son now owns his account. But because bank don't trust Robert so much, his credit limit was modified.");

    account.setName("Robert Clinton");
    account.setCreditLimit(-1000);
    account.setAccountStatus(1000);
    System.out.println(account.name + " has account in " + account.getBankName() + " his IBAN is "
        + account.getIBAN() + " he has now  " + account.getAccountStatus()
        + " but his credit limit is  " + account.getCreditLimit());
    System.out.println("---------------------------------------------------------------------");
    Account account1 = new Account("Josefina Brodsky", "Royal Bank of Scotland", "UK124578986532",
        10000, -5000);
    System.out.println(account1.name + " has account in " + account1.getBankName() + " her IBAN is "
        + account1.getIBAN() + " he has now  " + account1.getAccountStatus()
        + " her credit limit is " + account.getCreditLimit());

    account1.setName("Josefina Tyler");
    account1.setAccountStatus(1000);
    System.out.println("Josefina was married, she changed her name now she is " + account1.name
        + " and she lost a lot of money, now her account status is " + account1.getAccountStatus());

  }

}
