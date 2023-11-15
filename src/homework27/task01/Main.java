package homework27.task01;



public class Main {

  public static void main(String[] args) {

    Human human = new Human("Vasile", 24, "Manager");
    human.introduce();
    human.setAge(35);
    human.setOccupation("Head Manager");
    human.introduce();
    System.out.println("------------------------------------------------------------");
    Human human1 = new Human("Vlad", 19, "Trucker");
    human1.introduce();
    human1.setAge(32);
    human1.setOccupation("Head of logistic department");
    human1.introduce();



  }

}
