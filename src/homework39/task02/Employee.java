package homework39.task02;

public class Employee {
 private String name;
   private double salary;
  private final  String jobTitle;

  public void setName(String name) {
    this.name = name;
  }

  public Employee(String name, double salary, String jobTitle) {
    this.name = name;
    this.salary = salary;
    this.jobTitle = jobTitle;

  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setSalary(double salary) {
    this.salary = salary;


  }

  @Override
  public String toString() {
    return "Employee " + name + "salary"+ salary+ "job title" + jobTitle;
  }

}
