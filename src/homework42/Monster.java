package homework42;

import java.lang.annotation.Target;

public class Monster extends Entity implements Attackable {

  protected Monster(String name, int health, int attack) {
    super(name, health, attack);
  }


  @Override
  public void attack(Attackable target) {
    if (target instanceof Entity) {
      System.out.println(name + " attacked " + ((Entity) target).getName());
      ((Entity) target).setHealth(getHealth() - getAttack());
    }

  }


  @Override
  public void takeDamage(Attackable source) {
    System.out.println(name + " was attacked by " + ((Entity) source).getName()
        + " and received damage " + ((Entity) source).getAttack());

  }
}








