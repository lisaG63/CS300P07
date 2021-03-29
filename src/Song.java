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
 * An instances of this class represents a single song.
 * 
 * @author Weihang Guo
 *
 */
public class Song {
  private String title;//stores the name of the song
  private String artist;//stores the musician who performs the song
  
  /**
   * Initializes a new song with the specified information.
   * @param title or name of this new song
   * @param artist or musician who performs this song
   */
  public Song(String title, String artist) {
    //sets the fields to the input parameters
    this.title = title;
    this.artist = artist;
  }
  
  /**
   * Returns a string representation of this song. This string should be formatted as follows: 
   * "TITLE by ARTIST", where this song's title and artist are used in place of the TITLE and 
   * ARTIST place holders.
   * @return string representation of this song
   */
  @Override
  public String toString() {
    return title + " by " + artist;
  }
  
  /**
   * Returns true when this song's title and artist strings contain the same contents as the other 
   * song's title and artist strings, and false otherwise. Note that this method takes an Object 
   * rather than a Song argument, so that it Overrides Object.equals(Object). If an object that is 
   * not an instance of Song is ever passed to this method, it should return false.
   * @param other Song object to compare this object to
   * @return true when the two songs have matching title and artist
   */
  @Override
  public boolean equals(Object other) {
    if (other instanceof Song && toString().equals(other.toString())) {
      return true;
      //Check if the object passed in is an instance of Song and if they have the same song name
      //and artist name.
    }
    return false;
  }
  

  




}
