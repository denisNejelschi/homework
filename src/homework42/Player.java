package homework42;

public abstract class Player extends Entity implements Attackable {
    protected Player(String name, int health, int damage) {
        super(name, health, damage);
    }
}
