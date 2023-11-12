package homework27.task02;

public class Account {
  public String name;
  protected String bankName;
  private final String IBAN;
  private double accountStatus;
  private double creditLimit;

  public Account(String name, String bankName, String IBAN, double accountStatus,
      double creditLimit) {
    this.name = name;
    this.bankName = bankName;
    this.IBAN = IBAN;
    this.accountStatus = accountStatus;
    this.creditLimit = creditLimit;
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
  public double getAccountStatus() {
    return accountStatus;
  }
  public void setAccountStatus(double accountStatus) {
    this.accountStatus = accountStatus;
  }
  public double getCreditLimit() {
    return creditLimit;
  }
  public void setCreditLimit(double creditLimit) {
      this.creditLimit = creditLimit;
    }


}

