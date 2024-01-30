package homework54;

public class Song {

  private final String title;
  private final String artist;
  private final int duration;

  public Song(String name, String artist, int duration) {
    this.title = name;
    this.artist = artist;
    this.duration = duration;
  }

  public String getName() {
    return title;
  }


  public String getArtist() {
    return artist;
  }


  public int getDuration() {
    return duration;
  }


  @Override
  public String toString() {
    return
        "\ntitle: " + title + '\'' +
            "\n artist: " + artist + '\'' +
            " \nduration " + (duration / 60) + "min. " + (duration % 60) + "sec.";
  }
}
