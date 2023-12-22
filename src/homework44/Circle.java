package homework44;

public class Circle extends Shape {

  protected double radius;

  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }



  @Override
  public String toString() {
    return name + "with radius "
        + radius + "has perimeter  " + getPerimeter();
  }
}
