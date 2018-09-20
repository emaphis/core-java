/*
 * Chapter 6 Classes
 * Section interfaces
 */
package vol1.chap06.interfaces;

/**
 * Objects that are relatable.
 * @author emaphis
 */
public interface Relatable {
   /**
    * this (object calling isLargerThan)
    * and other must be instance of
    * the same class returns 1, 0, -1
    * if this greater than, equal too
    * or less than other
    * @param other
    * @return
    */
   public int isLargerThan(Relatable other);
}
