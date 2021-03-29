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

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  An instance of this class represents a collection of song which contains Songs.
 * 
 * @author Weihang Guo
 *
 */
public class SongCollection implements java.lang.Iterable<Song> {
  private DoublyLinkedNode<Song> head;//the first DoublyNode Song stored in the list
  private DoublyLinkedNode<Song> tail;//the last DoublyNode Song stored in the list
  private boolean playDirectionForward;//represents the play order
  
  /**
   * Initializes a SongCollection.
   */
  public SongCollection() {
    //sets head and tail to null and playDirectionForward to true
    head = null;
    tail = null;
    playDirectionForward = true;
  }
  
  /**
   * Adds song to the end/tail of this doubly linked list.
   * @param song the song to be added at the end of the song list
   * @throws NullPointerException when song is null
   */
  public void add(Song song) {
    if (song == null) {//checks if the song is null
      throw new NullPointerException();
    }
    DoublyLinkedNode<Song> newSong = new DoublyLinkedNode<Song>(song);
    //creates a DoublyLinkedNode newSong to store the song input
    if (head ==null) {
      //if the SongCollection is empty, assign the newSong to both head and tail
      head = newSong;
      tail = newSong;
    } else {
      //if the SongCollection is not empty
      tail.setNext(newSong);//set the next song of tail to the newSong
      newSong.setPrevious(tail);//set the previous song of newSong to tail
      tail = newSong;//set tail to newSong
    }
    
  }
  

 /**
  * Removes and returns song from the front/head of this list.
  * @return song from the front/head of this list
  * @throws NoSuchElementException when list is empty
  */
  public Song remove() {
   if (head == null) {//Checks if the list is empty
     throw new NoSuchElementException();
   }
   DoublyLinkedNode<Song> curHead = head;
   //creates a DoublyLinkedNode curHead to store the head before being removed
   if (head == tail) {
     //if the SongCollection has only one song, the only song is removed
     //set both head and tail to null
     head = null;
     tail = null;
     return curHead.getData();
   } 
     //if the SongCollection has more than one song, the head is removed
     head.getNext().setPrevious(null);//set the previous song of the song after head to null
     head = head.getNext();//set head to the next song of head
     return curHead.getData();
  }
  
  /**
   * Sets the play direction.
   * @param isForward if true then the play direction is forward, if false then the play direction
   * is reverse
   */
  public void setPlayDirection(boolean isForward) {
    playDirectionForward = isForward;
  }

  /**
   * Iterates the SongCollection
   */
  @Override
  public Iterator<Song> iterator() {
    if (playDirectionForward) {
      return new Playlist(head);
      //if the play direction is forward, use the iterator Playlist to iterate
    }
    return new ReversePlaylist(tail);
    //if the play direction is reverse, use the iterator ReversePlaylist to iterate
  }


}

///////////////////////////////////////////////////////////////////////////////////
//For each of the following big-O time complexity analyses, consider the problem
//size to be the number of Songs that are stored within the argument songs, when
//the method is first called.
//
//For analysisMethodA, the big-O time complexity is ____O(1)________.
//
//For analysisMethodB, the big-O time complexity is ____O(n)________.
//
//For analysisMethodC, the big-O time complexity is ____O(1)________.
//
///////////////////////////////////////////////////////////////////////////////////
