package homework44;

public class Main {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle("rectangle", 5, 7);
    Circle circle = new Circle("Circle", 5);
    Polygon pentagon = new Polygon("Pentagon", 5, 5);
    CurvedLine  curvedLine = new CurvedLine("Curved");

    System.out.println(rectangle.getPerimeter());
    System.out.println(circle.getPerimeter());
    System.out.println(pentagon.getPerimeter());
    System.out.println(curvedLine.getPerimeter());

  }
}
