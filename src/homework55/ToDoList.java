package homework55;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoList {

  public static void main(String[] args) {

    Map<String, Integer> toDoList = new HashMap<>();
    System.out.println("Making of to do list");
    Scanner scanner = new Scanner(System.in);
    String userInput;
    int duration = 0;
    int totalTime = 0;
    while (true) {
      System.out.println("To do: ");
      userInput = scanner.nextLine();
      if (userInput.equals("end")) {
        break;
      }

      System.out.println("minutes: ");
      duration = scanner.nextInt();
      totalTime += duration;
      scanner.nextLine();
      toDoList.put(userInput, duration);

    }

    System.out.println("Amount to do: " + toDoList.size());
    System.out.println(toDoList);
    System.out.println("Total time needed: " + totalTime / 60 + "h." + totalTime % 60 + "min.");



  }


}


