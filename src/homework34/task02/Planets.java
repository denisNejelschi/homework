package homework34.task02;

public enum Planets {
  MERCURY(" Mercury is a hot piece of rock"),
  VENUS( " Venus  is a piece of rock with very acid atmosphere"),
  EARTH(" Earth you live on it. it is nice piece of rock with oxygen and water and people on it"),
  MARS(" Mars red piece of rock. with weak atmosphere. Ilon Musk's dream"),
  JUPITER(" Jupiter = gas. a lot of gas, more than you can imagine. Gas giant."),
  SATURN(" Saturn is Tolkien's gas giant, with rings"),
  URANUS("Uranus is the smallest of giants, but very cold there. Ice giant."),
  NEPTUNE(" Neptune, no big difference from the Uranus. but it is the last planet. don't even think about Pluto. it was downgraded ");
  final String info;

  Planets(String info) {
    this.info = info;
  }

  public String getInfo() {
    return info;
  }
}

