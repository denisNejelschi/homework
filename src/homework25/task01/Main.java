package homework25.task01;

public class Main {

  public static void main(String[] args) {

    Human john = new Human();
    john.name = "John";
    john.age = 38;

    Human denis = new Human();
    denis.name = "Denis";
    denis.age = 39;

    Human elena = new Human();
    elena.name = "Elena";
    elena.age = 33;
john.introduce();
denis.introduce();
elena.introduce();

  }
}