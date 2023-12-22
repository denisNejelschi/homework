package homework44;

public class Rectangle extends Shape {

  protected double length;
  protected double width;

  protected Rectangle(String name, double length, double width) {
    super(name);
    this.length = length;
    this.width = width;
  }


  @Override
  public double getPerimeter() {
    return 2 * (length + width);
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return name +  " with dimensions"+ length + " X " + width + " has perimeter " + getPerimeter();

  }
}

