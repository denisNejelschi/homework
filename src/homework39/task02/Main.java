package homework39.task02;

import java.util.Scanner;

public class Main {

  public static void startWork(Employee[] employee) {
    for (int i = 0; i < employee.length; i++) {

      if (employee[i] instanceof Developer) {
        ((Developer) employee[i]).work();
      }
      if (employee[i] instanceof Manager) {
        ((Manager) employee[i]).forceToWork();
      }


    }
  }

    public static void main (String[]args){
      String[] list = {"Olga", "Dima", "Denis", "Thomas", "Alex", "Thorstein", "Waldemar", "Ulrike",
          "Jutta"};
      Employee[] employee = new Employee[10];
      employee[0] = new Manager("Elena", 2500);
      for (int i = 1; i < employee.length; i++) {
        employee[i] = new Developer(list[i - 1], 1700);

      }
      for (int i = 0; i < employee.length; i++) {
        System.out.println(employee[i]);
      }
      System.out.println("**************************");
      startWork(employee);


    }

  }


