package homework42;

import java.util.Objects;

public abstract class Entity {
    protected String name;
    protected int health;
    protected int damage;

    protected Entity(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, damage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof Entity) {
            Entity entity = (Entity) o;
            return entity.damage == this.damage
                    && entity.health == this.health
                    && entity.name.equals(this.name);
        }
        return false;
    }
}
