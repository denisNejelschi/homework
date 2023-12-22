package homework42;

import java.util.Random;

public class Archer extends Player  {

  protected Archer(String name, int health, int damage) {
    super(name, health, damage);
  }

  @Override
  public String toString() {
    return "Archer" + super.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (!super.equals(o)) {
      return false;
    }
    return o instanceof Archer;
  }

  private boolean eventShouldOccur(double chance) {
    return new Random().nextInt(100) < chance;
  }

  @Override
  public void attack(Attackable target) {
    int finalDamage = damage;
    System.out.println("Archer " + name + " shots an arrow with damage " + damage);
    if (eventShouldOccur(20)) {
      System.out.println("Archer " + name + "deals double damage ");
      finalDamage *= 2;
    }
    target.takeDamage(this, finalDamage);
  }

  @Override
  public void takeDamage(Attackable source, int damage) {
    if (eventShouldOccur(25)) {
      System.out.println("Archer " + name + "avoided attack!");
    } else {
      health -= damage;
      System.out.println("Archer took " + damage + " damage. Now his health is " + health);
    }
  }
}
