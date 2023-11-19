package homework29;

public enum Semafor {
  RED("red"),
  YELLOW("yellow"),
  GREE("green");

  private String color;

  private Semafor(String color){
    this.color=color;
  }
public String getColor(){
    return color;
}

  public void setColor(String color) {
    this.color = color;
  }
}

