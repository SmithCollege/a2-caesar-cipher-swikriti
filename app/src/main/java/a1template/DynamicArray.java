// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;
import java.util.Arrays;


public class DynamicArray<T> implements IndexAccess<T>{
    
<<<<<<< HEAD
  // What instance variables do you need?
  //attributes
  private T[] baseArray;
  private int offset;
=======
    // What instance variables do you need?
    private T[] baseArray;
    private int offset;
>>>>>>> refs/remotes/origin/main


    
   // private int highindex;
   // private int lowindex;
    
    // Write a constructor to make a new DynamicArray Object from an array
    public DynamicArray(int offset,T[]message){
      this.baseArray = (T[]) new Object[message.length];

      
      for (int i = 0; i < message.length; i++){
        baseArray[i] = message[i];
      }

      this.offset=offset;
    }



<<<<<<< HEAD
  /**
   * Constructor containing base array, filling the new array with the alphabets passed to be processed
   * @param offset number to be increased or decreased the alphabets' place value by
   * @param message alphabet in here
   */
  public DynamicArray(int offset,T[]message){
    this.baseArray = (T[]) new Object[message.length];
    for (int i = 0; i < message.length; i++){
      baseArray[i] = message[i];
    }

    this.offset=offset;
  }



  /** Returns the value stored at a given index
  * @param i index of element to read
  * @return value stored at the given index
  */
  public T get(int i){
    return baseArray[i];
  }


  /** Returns the value stored at a given index plus the offset
    * @param i index of element to read
    * @param offset adjust index by this value
    * @return value stored at the given index
    */
  public T get(int i, int offset){
    return baseArray[(i+offset) % baseArray.length];
  }

  /** Called from ceasercipher to return each decoded alphabet
   * @param i index of element to read
   * @param offset adjust index by this value
   * @return decoded alphabet in the index increased by offset.
   */
  public T getdecode(int i, int offset){
    int index = (i+offset) % baseArray.length;
    return baseArray[index];
  }

   /** Called from ceasercipher to return each encoded alphabet
     * @param i index of element to read
     * @param offset adjust index by this value
     * @return decoded alphabet in the index decreased by offset.
     */

=======
    // Now implement the methods from IndexAccess?
    public T get(int i){
        return baseArray[i];
    }

    public T get(int i, int offset){
       
        //still need a throw exception or try catch in case the i is more than the elements in array
        // if ( (i+ offset) >= baseArray.length ){
        //     offset = offset % baseArray.length;

        // }

        return baseArray[(i+offset) % baseArray.length];
    }

    public T getdecode(int i, int offset){
      int index = (i+offset) % baseArray.length;
      return baseArray[index];
  }

>>>>>>> refs/remotes/origin/main
  public T getencode(int i, int offset){
    int index = (i-offset) % baseArray.length;
    if (index <0){
      index = index + 26;
    }

<<<<<<< HEAD
    return baseArray[index]; 
  }


  /** Stores the given value at the given index
    * @param i index of locaßtion to store
    * @param val value to store at given index
    */
  public void set(int i, T val){
        baseArray[i] = val;
  }
=======
    return baseArray[index];
}



    public void set(int i, T val){
        baseArray[i] = val;
    }

    // public static void main(String[] args) {
    //     DynamicArray<T> mDynamicArray = new DynamicArray<T>(3, "Whatttt");
    // }
>>>>>>> refs/remotes/origin/main



}