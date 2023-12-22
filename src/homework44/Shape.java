package homework44;

public abstract class Shape {
protected String name;


  protected Shape(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public abstract double getPerimeter();
}
