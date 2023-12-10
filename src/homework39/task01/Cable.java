package homework39.task01;

public class Cable {

  private String name;
  private double length;
  private double crossSection;

  private String metal;
  private int pinNr;

  public Cable() {

    this("", 0.0, 0.0, "", 0);
  }

  public Cable(String name, double length, double crossSection, String metal, int pinNr) {
    this.name = name;
    this.length = length;
    this.crossSection = crossSection;
    this.metal = metal;
    this.pinNr = pinNr;
  }

  public int getPinNr() {
    return pinNr;
  }

  public void setPinNr(int pinNr) {
    this.pinNr = pinNr;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getCrossSection() {
    return crossSection;
  }

  public void setCrossSection(double crossSection) {
    this.crossSection = crossSection;
  }

  public String getMetal() {
    return metal;
  }

  public void setMetal(String metal) {
    this.metal = metal;
  }

  @Override
  public String toString() {
    return "Cable description: " + "\n Cable name " + getName()
        + "\nLength : " + getLength() + " m"
        + "\n Cross section  : " + getCrossSection()+ " mm" + "\n Cable metall : "+ getMetal()
        + "\nconnector "+getPinNr();
  }
}
