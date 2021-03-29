import java.util.Iterator;

public class test {
  
  public static void main(String[] args) {
    SongCollection songs = new SongCollection();
    analysisMethodA(songs);
    System.out.println("A: ");
    display(songs);
    System.out.println("B copy: ");
    analysisMethodB(songs);
    System.out.println("C print: ");
    analysisMethodC(songs);
    songs.setPlayDirection(false);
    System.out.println("reverse:");
    display(songs);
    songs.remove();
    System.out.println("remove:");
    display(songs);
    songs.remove();
    System.out.println("remove:");
    display(songs);
    songs.remove();
    System.out.println("remove:");
    display(songs);
    
    
    
  }
  
  public static void display(SongCollection songs) {
    for(Song song: songs) {
      System.out.println(song);
    }
  }
  public static void analysisMethodA(SongCollection songs) {
    songs.add(new Song("C is for Cookie.", "Cookie Monster"));
    songs.add(new Song("Rubber Duckie.", "Ernie"));
    songs.add(new Song("Elmo's Song.", "Elmo"));
   }
   public static void analysisMethodB(SongCollection songs) {
    SongCollection copy = new SongCollection();
    for(Song song: songs)
    copy.add(song);
    for(Song song: copy)
    System.out.println(song);
   }
   public static void analysisMethodC(SongCollection songs) {
    Iterator<Song> playlist = songs.iterator();
    for(int i=0;i<1000;i++)
      if(playlist.hasNext())
         System.out.print(playlist.next() + "  ");
    System.out.println();
   }

}
