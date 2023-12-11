package homework39.task02;

public class Manager extends Employee{

  public Manager( String name, double salary){
    super(name, salary, "Manager");

  }
  public void forceToWork(){
    System.out.println(getJobTitle()+ " " + getName()+ " using aggressive  methods forces all to be active and to do their work");
  }

  @Override
  public String toString() {

      return "Manager " + getName()+ " salary "+ getSalary() ;
  }
}
