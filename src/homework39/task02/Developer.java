package homework39.task02;

public class Developer extends Employee{
 public Developer( String name, double salary){
   super(name, salary, "Developer");
 }
 public void work(){
   System.out.println(getJobTitle()+ " " +  getName()+ " says: " + "I am working very hard. with my small hands. right here right now!");

 }

  @Override
  public String toString() {
    return "Developer " + getName()+ " salary "+ getSalary();
  }
}
