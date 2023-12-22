package homework42;

public class Mage extends Player  {
  private double mana;


  public Mage(String name, int health, int damage, double mana) {
    super(name, health, damage);
    this.mana = mana;
  }

  public double getMana() {
    return mana;
  }

  public void setMana(double mana) {
    this.mana = mana;
  }

  @Override
  public String toString() {
    return "Mage{" +
        "name='" + name + '\'' +
        ", health=" + health +
        ", damage=" + damage +
        ", mana=" + mana +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (!super.equals(o)) {
      return false;
    }
    if (o instanceof Mage) {
      return ((Mage) o).mana == this.mana;
    }
    return false;
  }

  @Override
  public void attack(Attackable target) {
    int finalDamage;
    if (mana >= 1) {
      finalDamage = 2 * damage;
      mana--;
      System.out.println("Mage " + name + " attacks with " + finalDamage + " damage, his mana is now " + mana);
    } else {
      finalDamage = 0;
      System.out.println("Mage " + name + " doesn't have enough mana to attack!");
    }
    target.takeDamage(this, finalDamage);
  }

  @Override
  public void takeDamage(Attackable source, int damage) {
    health -= damage;
    mana += 0.2;
    System.out.println("Mana " + " took " + damage + " damage, his health is now " + health + " and mana is " + mana);
  }
}
