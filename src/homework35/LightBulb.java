package homework35;

public class LightBulb {

  private int barCode;    //изменил баркод со стринга на int чтоб стал цифрой, не дабл чтоб не было .0
  private String manufacturer;
  private int brightness;
  private String rgb; //Скорее всего сдесь параметр лампочки ее цветовая гамма или цвет света, булеан никак.
  private int power; // добавил поле. оно в конструкторе есть а тут нет.
  private double price;


  public LightBulb(int barCode, String manufacturer, int brightness, int power, String rgb,
      double price) {
    this.barCode = barCode;
    this.manufacturer = manufacturer;
    this.brightness = brightness;
    this.power = power;
    this.rgb = rgb;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getBarCode() {
    return barCode;
  }

  public void setBarCode(int barCode) {
    this.barCode = barCode;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public int getBrightness() {
    return brightness;
  }

  public int getPower() {
    return power;
  }

  public String rGb() {
    return rgb;
  }
}