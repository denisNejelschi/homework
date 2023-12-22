package homework42;

public class Monster extends Entity implements Attackable {
    public Monster(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack(Attackable target) {
        System.out.println("Monster " + name + " attacking with " + damage + " damage!");
        target.takeDamage(this, damage);
    }

    @Override
    public void takeDamage(Attackable source, int damage) {
        System.out.println("Monster " + name + " takes " + damage + " damage!");
        health -= damage;
        if (isAlive()) {
            System.out.println("Monster " + name + " now has " + health + " health!");
        } else {
            System.out.println("Monster " + name + " died!");
        }
    }
}
