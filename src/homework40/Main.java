package homework40;

public class Main {

  public static void main(String[] args) {
    Cable cable = new Cable(" USB to lightning ",1.5,1.8,"Cooper", 8);
    Cable cable1 = new Cable(" USB to lightning ",1.5,1.8,"Cooper", 8);


    System.out.println(cable.equals(cable1));

    cable1.setMetal("Aluminium");

    System.out.println(cable.equals(cable1));
  }

}
