package homework42;

public class Main {

  public static void main(String[] args) {
    Monster monster1 = new Monster("Monster1", 100, 10);
    // Monster monster2 = new Monster("Monster2", 1000, 10);
    Mage mage = new Mage("Mage", 50, 7, 10);

    monster1.attack(mage);
    mage.takeDamage(monster1);

    mage.attack(monster1);
    monster1.takeDamage(mage);

    System.out.println(monster1);
    System.out.println(mage);


  }

}
