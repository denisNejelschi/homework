package homework35;
/*
можно использовать при создании карточки продукта в магазине или онлайн платформе.
можно использовать при создании обЬектов лампочек для их визуализации и сравнения по
интересующим парамтрам.

ТЗ. Создать класс Лампочка указав важные по вашему мнению поля. чтобыможно было отобразить
важную информацию о продукте свозможностью изменять данные о продукте. используя акцессоры
 */

public class Main {

  public static void main(String[] args) {

    LightBulb bulb1 = new LightBulb(19456, "Philips", 800, 45, "Cold", 13.0);

    System.out.println(
        "Product bulb: " + "\nBarcode " + bulb1.getBarCode() + "\nManufacturer: "
            + bulb1.getManufacturer()
            + "\nBrightness in Lumen: " + bulb1.getBrightness() + "\nLight temperature: "
            + bulb1.rGb()
            + "\nThe price is: " + bulb1.getPrice() + "eur.");

    System.out.print("________________________");
    LightBulb bulb2 = new LightBulb(25874, "Bosch", 450, 30, "Warm", 9);
    System.out.print(
        "\nProduct bulb: " + "\nBarcode " + bulb2.getBarCode() + "\nManufacturer: "
            + bulb2.getManufacturer()
            + "\nBrightness in Lumen: " + bulb2.getBrightness() + "\nLight temperature: "
            + bulb2.rGb()
            + "\nThe price is: " + bulb2.getPrice() + "eur.");


  }


}
