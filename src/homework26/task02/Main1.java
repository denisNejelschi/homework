package homework26.task02;

public class Main1 {

  public static void printProcessor(Processor processor) {
    System.out.println("Manufacturer: " + processor.manufacturer);
    System.out.println("Series: " + processor.series);
    System.out.println("Speed: " + processor.speed + " GHz");
    System.out.println("Cores: " + processor.cores);
    System.out.println("Threads: " + processor.threads);
    System.out.println("Cash memory: "+ processor.cashMemory + " kB");
  }

  public static void main(String[] args) {

    Processor processor = new Processor("AMD", "Ryzen 7", 2, 8, 16, 16000);
    printProcessor(processor);
  }

  }
