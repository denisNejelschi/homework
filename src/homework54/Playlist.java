package homework54;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class Playlist {

  private List<Song> songs;


  public Playlist() {
    songs = new ArrayList<>();
  }

  public void addSong(Song song) {
    songs.add(song);
  }

  public void removeSong(Song song) {
    songs.remove(song);
  }

  public Song getSong(int index) {
    if (index > 0 && index < songs.size()) {
      return songs.get(index);
    }
    return null;
  }

  public Queue<Song> getListeningQueue() {
    return new LinkedList<>(songs);
  }

  public Queue<Song> getReverseListeningQueue() {
    List<Song> reverseList = new ArrayList<>(songs);
    Collections.reverse(reverseList);
    return new LinkedList<>(reverseList);
  }

  public Queue<Song> getShuffledListeningQueue() {
    List<Song> shuffledList = new ArrayList<>(songs);
    Collections.shuffle(shuffledList);
    return new LinkedList<>(shuffledList);
  }


}
