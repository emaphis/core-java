/*
 * Chapter 6 Classes
 * Section generics
 */
package vol1.chap08.generics;

/**
 * Class to contain objects
 * @author emaphis
 * @param <T> the type of the value boxed
 */
public class Box<T> {
   // T stands for "Type"
   private T t;

   public void set(T t) { this.t = t; }
   public T get() { return t; }
}
