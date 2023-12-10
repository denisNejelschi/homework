package homework39.task01;

public class Main {

  public static void main(String[] args) {
    Cable cable = new Cable(" USB to lightning ",1.5,1.8,"Cooper", 8);

    System.out.println(cable);
    System.out.println("-------------------");
    cable.setMetal("Aluminium");
    cable.setCrossSection(3.8);
    cable.setName("HDMI");
    cable.setPinNr(19);

    System.out.println(cable);
  }

}
