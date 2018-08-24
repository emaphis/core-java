/*
 * Chapter 6 - Interfaces
 * Exercise 7
 */
package vol1.chap06.exercises;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author emaphis
 */
public class DigitSequence implements Iterator<Integer> {
   int i = 0;

   @Override
   public boolean hasNext() {
      return true;
   }

   @Override
   public Integer next() {
      i++;
      return i;
   }

   @Override
   public void remove() {
      //Iterator.super.remove();
   }

   @Override
   public void forEachRemaining(Consumer<? super Integer> action) {
      Iterator.super.forEachRemaining(action);
   }
}
