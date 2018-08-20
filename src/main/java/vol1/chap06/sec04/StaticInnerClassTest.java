/*
 * Chap 6 Sec 4
 * Static inner classes
 */
package vol1.chap06.sec04;


public class StaticInnerClassTest {
   public static void main(String[] args) {
      double[] d = new double[20];
      for (int i = 0; i < d.length; i++)
         d[i] = 100 * Math.random();
      ArrayAlg.Pair p = ArrayAlg.minmax(d);
      System.out.println("min = " + p.getFirst());
      System.out.println("max = " + p.getSecond());
   }
}
