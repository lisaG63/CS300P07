import java.util.NoSuchElementException;

//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           P07 Study Playlist
// Files:           SongCollection.java, DoublyLinkedNode.java, Playlist.java, 
//                  Song.java, ReversePlaylist.java
// Course:          CS300, fall, 2019
//
// Author:          Weihang Guo
// percentage:           wguo63@wisc.edu
// Lecturer's Name: Mouna Kacem
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates, 
// strangers, and others do.  If you received no outside help from either type
//  of source, then please explicitly indicate NONE.
//
// Milks: None
// Online Sources: None
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

/**
 * An iterator to iterate a SongCollection in reverse direction.
 * @author Weihang Guo
 *
 */
public class ReversePlaylist implements java.util.Iterator<Song> {
  private DoublyLinkedNode<Song> curSong;//stores the current song which is being read
  
  /**
   * Initializes the iterator with the first song
   * @param songNode
   */
  public ReversePlaylist(DoublyLinkedNode<Song> songNode) {
    curSong = songNode;//set the current song to the input song node
  }
  
  /**
   * Returns true if the iteration has more elements.
   * @return true if the iteration has more elements
   */
  @Override
  public boolean hasNext() {
    return curSong != null;
  }

  /**
   * Returns the previous song in the list.
   * @return the previous song in the list
   */
  @Override
  public Song next() {
    if (!hasNext()) {//checks if the iteration has more elements
      throw new NoSuchElementException();
    }
    Song song = curSong.getData();//gets and stores the current song's data
    curSong = curSong.getPrevious();//updates current song to the previous song of current song
    return song;
  }

}
