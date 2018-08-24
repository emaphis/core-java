/*
 * Interfaces
 */
package vol1.chap06.sec01;

/**
 * Test IntSequence
 * @author emaphis
 */
public class TestIntSequence {
   public static double average(IntSequence seq, int n) {
      int count = 0;
      double sum = 0;
      while (seq.hasNext() && count < n) {
         count++;
         sum += seq.next();
      }
      return count == 0 ? 0 : sum / count;
   }

   public static void printSeq(IntSequence seq) {
      while (seq.hasNext()) {
         System.out.print(" " + seq.next());
      }
      System.out.println();
   }

   public static void main(String[] args) {
      SquareSequence squares = new SquareSequence();
      double avg = average(squares, 100);
      System.out.println("averate of the first 100 squares = " + avg);

      IntSequence digits = new DigitSequence(1729);
      printSeq(digits);
      avg = average(digits, 4);
      System.out.println("averaage of the first digits 1 7 2 9 = " + avg);

   }
}