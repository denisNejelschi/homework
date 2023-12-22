package homework44;

import java.util.Scanner;

public class CurvedLine extends Shape {

  public CurvedLine(String name) {
    super(name);

  }


  @Override
  public double getPerimeter() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("how many sides has your polygonal shape? minimum 3");
    int sides;
    double perimeter = 0;
    do {
      System.out.println("how many sides has your polygonal shape? minimum 3");
      sides = scanner.nextInt();
    } while (sides < 3);
    double[] polygon = new double[sides];
    System.out.println("enter sides length ");

    for (int i = 0; i < polygon.length; i++) {
      polygon[i] = scanner.nextDouble();
      perimeter += polygon[i];
    }

    return perimeter;
  }
}

