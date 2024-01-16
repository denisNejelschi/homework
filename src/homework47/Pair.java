package homework47;

public class Pair <L,R>{
  private L names;
  private R prices;

  public Pair(L names, R prices) {
    this.names = names;
    this.prices = prices;

  }

  public L getNames() {
    return names;
  }

  public void setNames(L names) {
    this.names = names;
  }

  public R getPrices() {
    return prices;
  }

  public void setPrices(R prices) {
    this.prices = prices;
  }


}
