package homework42;

public class Monster  extends Entity implements Attackable{

  protected Monster(String name, int health, int attack) {
    super(name, health, attack);
  }


  @Override
  public void attack(Attackable target) {

    if (target instanceof Entity) {
      if (isAlive()) {

        ((Entity) target).setHealth(getHealth() - getAttack());
        System.out.println(getName() + " attacked " + ((Entity) target).getName());
      }
    }
  }

    @Override
    public void takeDamage(Attackable source) {
      if (isAlive()) {
        if(source instanceof Entity){
         setHealth(getHealth()- ((Entity) source).attack);

        }

      }
    }


  }



