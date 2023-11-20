package homework28;


public class Main {

  public static void main(String[] args) {
    double[] arr = {4, 6, 7, 1, -5, 6, 9};

    MyArray myArray = new MyArray(arr);
    myArray.addElement(arr.length+1,-18 );
    myArray.removeLast();
    myArray.replace(6,10);
    myArray.removeFromArray(1);
    System.out.println(myArray.isEmpty(arr));
    System.out.println(myArray.contains(12));



      System.out.println(myArray);

    }
  }

