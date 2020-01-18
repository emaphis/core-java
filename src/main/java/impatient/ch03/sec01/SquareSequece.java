/*
 * Chapter 3 Intefaces and Lambda Expresions
 * Sec 1 Interfaces
 * Implemeting an Interface
 * SquareSequece.java
 */
package impatient.ch03.sec01;

/**
 *
 * @author emaphis
 */
public class SquareSequece implements IntSequence {
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
