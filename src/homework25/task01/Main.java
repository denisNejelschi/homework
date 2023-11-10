package homework25.task01;

public class Main {

  public static void main(String[] args) {
    Human human = new Human();
    human.name = "Jannet";
    human.age = 19;

    Human human1 = new Human();
    human1.name = "Oleg";
    human1.age = 34;
    human1.introduce();
    human.introduce();
  }

}
