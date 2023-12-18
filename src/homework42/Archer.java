package homework42;

public class Archer extends Player implements Attackable{

  protected Archer(String name, int health, int attack) {
    super(name, health, attack);
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public void attack(Attackable target) {

  }

  @Override
  public void takeDamage(Attackable source) {

  }
}
