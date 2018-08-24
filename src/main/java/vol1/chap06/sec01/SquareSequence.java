/*
 * Interfaces
 */
package vol1.chap06.sec01;

/**
 *
 * @author emaphis
 */
public class SquareSequence implements IntSequence {
   private int i;

   @Override
   public boolean hasNext() {
      return true;
   }

   @Override
   public int next() {
      i++;
      return i * i;
   }
   
}
