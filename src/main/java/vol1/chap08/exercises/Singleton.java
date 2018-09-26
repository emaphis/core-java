/*
 * Chapter 8 Generics
 * Section vol1.chap08.exercises #2
 */
package vol1.chap08.exercises;

/**
 * Exercise 2
 * @author emaphis
 * @param <T>
 */
public class Singleton<T> {
   private T instance = null;

   public T getInstance() {
      if (instance == null)
         instance = (T) new Singleton<T>();

      return instance;
   }
}
