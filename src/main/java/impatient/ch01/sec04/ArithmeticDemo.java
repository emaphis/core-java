
package impatient.ch01.sec04;

/**
 * Examples of arithmetic
 * @author emaphis
 */
public class ArithmeticDemo {
   public static void main(String[] args) {
      // Division and remainder
      System.out.println(17 / 5);
      System.out.println(17 % 5);
      System.out.println(Math.floorMod(17, 5));

      System.out.println(-17 / 5);
      System.out.println(-17 % 5);
      System.out.println(Math.floorMod(-17, 5));

      // Increment and decrement
      int[] a = { 17, 29 };
      int n = 0;
      System.out.printf("%d %d\n", a[n++], n);
      n = 0;
      System.out.printf("%d %d\n", a[++n], n);

      // Powers and roots
      System.out.println(Math.pow(10,9));
      System.out.println(Math.sqrt(1000000));

      // Number conversions
      double x = 42;
      System.out.println(x);
      float f = 123456789;
      System.out.println(f);
      x = 3.75;
      n = (int)x;
      System.out.println(n);
      n = (int) Math.round(x);
      System.out.println(n);

      System.out.println('J' + 1); // 75
      char next = (char)('J' + 1);
      System.out.println(next); // 'K'

      n = (int) 3000000000L;
      System.out.println(n); // -1294967296
   }
}