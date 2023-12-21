package homework42;

import java.util.Objects;

public abstract class Entity {
protected String name;
protected int health;
protected int attack;

  public Entity(String name, int health, int attack) {
    this.name = name;
    this.health = health;
    this.attack = attack;
  }

public  boolean isAlive(){
  return this.health > 0;
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

  public int getAttack() {
    return attack;
  }

  public void setAttack(int attack) {
    this.attack = attack;
  }

  @Override
  public String toString() {
    return "Entity{" +
        "name='" + name + '\'' +
        ", health=" + health +
        ", power=" + attack +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Entity entity = (Entity) obj;
    return health == entity.health && attack == entity.attack && Objects.equals(name,
        entity.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, health, attack);
  }
}
