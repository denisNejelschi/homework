package homework42;

import java.util.Objects;

public class Warrior extends Player  {

  private int armor;

  public Warrior(String name, int health, int damage, int armor) {
    super(name, health, damage);
    this.armor = armor;
  }

  public int getArmor() {
    return armor;
  }

  public void setArmor(int armor) {
    this.armor = armor;
  }

  @Override
  public String toString() {
    return "Warrior{" +
        "name='" + name + '\'' +
        ", health=" + health +
        ", damage=" + damage +
        ", armor=" + armor +
        '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), armor);
  }

  @Override
  public boolean equals(Object o) {
    if (!super.equals(o)) {
      return false;
    }
    if (o instanceof Warrior) {
      return ((Warrior) o).armor == this.armor;
    }
    return false;
  }

  @Override
  public void attack(Attackable target) {
    System.out.println("Warrior " + name + "attacks with " + damage);
    target.takeDamage(this, damage);
  }

  @Override
  public void takeDamage(Attackable source, int damage) {
    damage -= armor / 2;
    if (damage >= 0) {
      health -= damage;
      System.out.println(
          "Warrior " + name + "takes damage " + damage + " , his health now is " + health);

    } else {
      System.out.println("Warrior " + name + "blocked attack");
    }
  }
}
