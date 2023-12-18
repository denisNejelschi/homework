package homework42;

public class Main {

  public static void main(String[] args) {
    Monster monster1 = new Monster("Monster1", 100, 5);
    Monster monster2 = new Monster("Monster2", 100, 6);

    monster1.attack(monster2);
    //monster2.attack(monster1);

    System.out.println(monster1);
    System.out.println(monster2);


  }

}
