package homework34.task02;

public enum Planets {
  MERCURY("it is a hot piece of rock"),
  VENUS( "it is a piece of rock with very acid atmosphere"),
  EARTH("you live on it. it is nice piece of rock with oxygen and water and people on it"),
  MARS("red piece of rock. with weak atmosphere. Ilon Musk's dream"),
  JUPITER("gas. a lot of gas, more than you can imagine. gas giant."),
  SATURN("Tolkien's gas giant, with rings"),
  URANUS("the smallest of giants, but very cold there. Ice giant."),
  NEPTUNE("no big difference from the Uranus. but it is the last planet. don't even think about Pluto. it was downgraded ");
   final String info;

  public String getInfo() {
    return info;
  }

  Planets (String info) {
  this.info = info;

}
}
