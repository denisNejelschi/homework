package homework54;

import java.util.Queue;


public class Main {

  public static void listenPlaylist(Queue<Song> queue) {
    System.out.println("Start listening the playlist: ");
    System.out.println(" ");
    while (!queue.isEmpty()) {
      Song currentSong = queue.poll();
      System.out.println("Now  is playing " + currentSong);
    }

    System.out.println("Playlist finished\n");
  }

  public static void main(String[] args) {

    Playlist playlist1 = new Playlist();

    playlist1.addSong(new Song("Smells like Teen Spirit", "Nirvana", 212));
    playlist1.addSong(new Song("About a girl", "Nirvana", 220));
    playlist1.addSong(new Song("Master of Puppets", "Metallica", 230));
    playlist1.addSong(new Song("Sandman", "Metallica", 192));
    playlist1.addSong(new Song("Purple rain", "Prince", 172));

    System.out.println("Playing normal");
    listenPlaylist(playlist1.getListeningQueue());
    System.out.println("Playing reversed");
    listenPlaylist(playlist1.getReverseListeningQueue());
    System.out.println("Playing shuffle");
    listenPlaylist(playlist1.getShuffledListeningQueue());


  }

}
