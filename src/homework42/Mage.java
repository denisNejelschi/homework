package homework42;

import java.util.Objects;

public class Mage extends Player implements Attackable {


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

        ", name='" + name + '\'' +
        ", health=" + health +
        ", attack=" + attack + " mana=" + mana +
        '}';
  }

  @Override
  public void attack(Attackable target) {

    if (target instanceof Entity) {
      System.out.println(name + " attacked " + ((Entity) target).getName());
      int mageAttack = attack*2;
      if (mana > 0) {

        mana--;
      }
      ((Entity) target).setHealth(getHealth() - mageAttack);
    } else if (mana <=0)
      ((Entity) target).setHealth(getHealth());
    }


  @Override
  public void takeDamage(Attackable source) {
    if (source instanceof Entity) {
      mana += ((Entity) source).attack * 0.2;
      System.out.println(name + " was attacked by " + ((Entity) source).getName()
          + " and received damage " + ((Entity) source).getAttack());
    }


  }
}
