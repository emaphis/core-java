/*
 * Chaper 8 Genereics
 * Exercis 5
 */
package vol1.chap08.exercises;

import java.util.Arrays;

/**
 *
 * @author emaphis
 */
public class SwapTest {
   public static <T> T[] swap(int i, int j, T... values) {
      T temp = values[i];
      values[i] = values[j];
      values[j] = temp;
      return values;
   }

   public static void main(String[] args) {
      Double[] result = swap(0, 1, 1.5, 2.0, 3.0);
      System.out.println("result=" + Arrays.toString(result));
      //Double[] result2 = SwapTest.<Integer>swap(0, 1, 1.5, 2, 3);
   }
}
