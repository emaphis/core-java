/*
 * Chapter 3 Interfaces
 * Sec 1 Interfaces
 * IntSeqDemo.java
 */
package impatient.ch03.sec01;

/**
 *
 * @author emaphis
 */
public class IntSeqDemo1 {
   public static double average(IntSequence seq, int n) {
      int count = 0;
      double sum = 0;
      while (seq.hasNext() && count < n) {
         count++;
         sum += seq.next();
      }

      return count == 0 ? 0 : sum / count;
   }

   public static void main(String[] args) {
      SquareSequece square = new SquareSequece();
      double avg = average(square, 100);
      System.out.println("avg: " + avg);

      // Converting to an Interface Type.
      IntSequence digits = new DigitSequence(1729);
      while (digits.hasNext()) {
         System.out.print(" - " + digits.next() + " ");
      }
      System.out.println();

      digits = new DigitSequence(1729);
      avg = average(digits, 100);
      System.out.println("avg: " + avg);
   }
}
