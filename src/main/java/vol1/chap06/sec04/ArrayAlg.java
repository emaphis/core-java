/*
 * Chapter 6 Sec 4
 * Static inner classes
 */
package vol1.chap06.sec04;

/**
 *
 * @author emaphis
 */
public class ArrayAlg {
   /**
    * A pair of floating point numbers
    */
   public static class Pair {
      private double first;
      private double second;

      /**
       * Constructs a pair from two floating-point numbers
       * @param f the first number
       * @param s the second number
       */
      public Pair(double f, double s) {
         first = f;
         second = s;
      }

      /**
       * Returns the first number of the pair
       * @return the first number
       */
      public double getFirst() {
         return first;
      }

      /**
       * Returns the second number of the pair
       * @return the second number
       */
      public double getSecond() {
         return second;
      }
   }

   public static Pair minmax(double[] values) {
      double min = Double.POSITIVE_INFINITY;
      double max = Double.NEGATIVE_INFINITY;
      for (double v : values) {
         if (min > v) min = v;
         if (max < v) max = v;
      }
      return new Pair(min, max);
   }
}
