package homework26.task02;

public class Main {

  public static void showInfo(Truck truck) {
    System.out.println("Model: " + truck.model);
    System.out.println("Fuel type: " + truck.fuelType);
    System.out.println("Price is: " + truck.price + "EUR");
    System.out.println("Range with full tank is: " + truck.range + "km");
    System.out.println("Average consumption is: " + truck.consumption + " L (kg if LNG) /100 km");
    System.out.println("Maximum weigh is " + truck.maxWeight + " to");
    System.out.println("Max payload is " + truck.maxPayload + "to");

  }

  public static void main(String[] args) {
    Truck truck = new Truck("Volvo", "LNG", 120000, 4500, 32.8, 42.5, 26.5);
    showInfo(truck);
    Truck truck1 = new Truck("Scania", "Diesel", 95000, 5500,27.2, 42.5, 26.5);
    System.out.println("------------------------------------------------");
    showInfo(truck1);
    Truck truck2 = new Truck("Mercedes Benz", "Diesel-Hybrid", 140000, 6000,22.4, 42.5, 25.0);
    System.out.println("------------------------------------------------");
    showInfo(truck2);
  }

}
