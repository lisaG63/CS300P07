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
 * An instance of this class represents a single node within a doubly linked list.
 * 
 * @author Weihang Guo
 *
 */
public class DoublyLinkedNode<T> {
  private DoublyLinkedNode<T> previous;//stores the previous node
  private T data;//stores the data
  private DoublyLinkedNode<T> next;//store the next node
  
  /**
   * Initializes a new node with the specified information.
   * @param previous node, which comes before this node in a doubly linked list
   * @param data to be stored within this node
   * @param next node, which comes after this node in a doubly linked list
   * @throws IllegalArgumentException when data is a null reference
   */
  public DoublyLinkedNode(DoublyLinkedNode<T> previous, T data, DoublyLinkedNode<T> next) {
    if (data == null) {//checks if the data is null
      throw new IllegalArgumentException();
    }
    //set the fields to the input parameters
    this.previous = previous;
    this.data = data;
    this.next = next;
  }
  
  /**
   * Initialize a new node with the specified data, and null next and previous reference.
   * @param data to be stored within this node
   * @throws IllegalArgumentException when data is a null reference
   */
  public DoublyLinkedNode(T data) {
    if (data == null) {//checks if the data is null
      throw new IllegalArgumentException();
    }
    //set data to the input parameter
    this.data = data;
    //set both previous and next node to null
    previous = null;
    next = null;
  }
  
  /**
   * Accessor method for this node's data.
   * @return the data stored within this node.
   */
  public T getData() {
    return data;
  }
  
  /**
   * Accessor method for this node's next node reference.
   * @return reference to the node that comes after this one in the list, or null when this is the 
   * last node in that list
   */
  public DoublyLinkedNode<T> getNext(){
    return next;
  }
  
  /**
   * Mutator method for this node's next node reference.
   * @param next node, which comes after this node in a doubly linked list
   */
  public void setNext(DoublyLinkedNode<T> next) {
    this.next = next;
  }
 
  /**
   * Accessor method for this node's previous node reference.
   * @return reference to the node that comes before this one in the list or null when this is the 
   * first node in that list
   */
  public DoublyLinkedNode<T> getPrevious(){
    return previous;
  }
  
  /**
   * Mutator method for this node's previous node reference.
   * @param previous node, which comes before this node in a doubly linked list
   */
  public void setPrevious(DoublyLinkedNode<T> previous) {
    this.previous = previous;
  }


}
