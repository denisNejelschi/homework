package homework44;

public class Polygon extends Shape{
  private int sides;
  private double sideLength;

  protected Polygon(String name, int sides, double sideLength) {
    super(name);
    this.sides=sides;
    this.sideLength=sideLength;
  }


  @Override
  public double getPerimeter() {
    return sides*sideLength;
  }
}
