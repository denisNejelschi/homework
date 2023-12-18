package homework42;

import java.util.Objects;

public class Mage extends Player implements Attackable{


  protected double mana;

  public Mage(String name, int health, int attack, double mana) {
    super(name, health, attack);
    this.mana = mana;
  }

  public double getMana() {
    return mana;
  }

  public void setMana(double mana) {
    this.mana = mana;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Mage mage = (Mage) o;
    return Double.compare(mana, mage.mana) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), mana);
  }

  @Override
  public String toString() {
    return "Mage{" +
        "mana=" + mana +
        ", name='" + name + '\'' +
        ", health=" + health +
        ", power=" + attack +
        '}';
  }

  @Override
  public void attack(Attackable target) {

  }

  @Override
  public void takeDamage(Attackable source) {

  }
}
