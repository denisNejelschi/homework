package homework28;

public class MyArray {

  private double[] array;

  public MyArray() {
    array = new double[0];
  }

  public MyArray(double[] array) {
    this.array = new double[array.length];
    copy(array, this.array);
  }

  private void copy(double[] src, double[] dst) {
    for (int i = 0; i < src.length; i++) {
      dst[i] = src[i];
    }
  }

  public double get(int index) {
    return array[index];
  }

  public void set(int index, double value) {
    array[index] = value;

  }

  public int size() {
    return array.length;
  }

  public int indexOf(double value) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return i;
      }
    }
    return -1;
  }

  public void add(int index, double value) {
    if (index < 0 || index > array.length) {
      return;
    }
    double[] newArray = new double[array.length + 1];
    copy(array, newArray);
    for (int i = newArray.length - 1; i > index; i--) {
      newArray[i] = newArray[i - 1];

    }
    newArray[index] = value;
    array = newArray;

  }

  public void remove(int index) {
    if (index < 0 || index > array.length) {
      return;
    }
    double[] newArray = new double[array.length - 1];
    for (int i = 0; i < newArray.length; i++) {
      if (i < index) {
        newArray[i] = array[i];
      } else {
        newArray[i] = array[i + 1];

      }
    }
    array = newArray;
  }
  public void addElement(int index, double value) {
    double[] newArray = new double[array.length + 1];
    copy(array, newArray);
    newArray[array.length] = value;
    array = newArray;

  }
  public void removeLast( ) {
    double[] newArray = new double[array.length - 1];//
    for (int i = 0; i < newArray.length; i++) {
      newArray[i]=array[i];
      array = newArray;
    }
  }
  public void replace(double val, double newVal){
    for (int i = 0; i < array.length ; i++) {
      if(array[i]==val){
        array[i]=newVal;
      }

    }
  }
 public void removeFromArray(double val){
   for (int i = 0; i < array.length ; i++) {
     if (val == array[i]) {
       remove(indexOf(val));
     }
   }

 }
 public boolean isEmpty(double[] array){
    if(array.length==0){
      return true;
    }else {
      return false;
    }
 }

public boolean contains(double val){
  for (int i = 0; i < array.length ; i++) {
    if(array[i]==val){
      return true;

    }
  }
  return false;
}
  public String toString() {
    String result = "[ ";
    for (int i = 0; i < array.length; i++) {
      result += array[i];
      if (i != array.length - 1) {
        result += ", ";
      }
    }
    result += "]";
    return result;
  }


}






