package homework42;

public class Warrior extends Player  implements Attackable{

  protected int armor;

  public Warrior(String name, int health, int attack, int armor) {
    super(name, health, attack);
    this.armor = armor;
  }

  @Override
  public void attack(Attackable target) {

  }

  @Override
  public void takeDamage(Attackable source) {

  }
}
