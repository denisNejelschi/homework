package homework27.task01;

public class Human {

  private String name;
  private int age;
  private String occupation;

  public Human(String name, int age, String occupation) {
    this.name = name;
    this.age = age;
    this.occupation = occupation;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
  public void setAge(int age) {

    if (age < 18) {

      this.age = 18;
    }else{
      this.age=age;
    }

  }
  public String getOccupation() {
    return occupation;
  }
  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }
public  void introduce() {
  System.out.println("Hi, my name is  " + name + " I am "+ age+ " years old " + "I am " + occupation + "." );

}

}

