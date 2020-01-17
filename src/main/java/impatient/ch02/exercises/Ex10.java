/*
 * Exercises Chapter 2
 * Ex10.java
 */
package impatient.ch02.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class RandomNumbers {
   private static final Random generator = new Random();

   public static int nextInt(int low, int high) {
      return low + generator.nextInt(high - low + 1);
   }

   public static int randomElement(List<Integer> array) {
      if (array == null || array.isEmpty()) return 0;
      int pick = generator.nextInt(array.size());
      return array.get(pick);
   }

   public static int randomElement(int[] array) {
      if (array == null || array.length == 0) return 0;
      int pick = generator.nextInt(array.length);
      return array[pick];
   }
}

/**
 *
 * @author emaphis
 */
public class Ex10 {

   public static void main(String[] args) {
      int[] array1= new int[] {5, 4, 3, 2, 1, 0};
      System.out.println(RandomNumbers.randomElement(array1));

      List<Integer> array2 = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1, 0));
      System.out.println(RandomNumbers.randomElement(array2));
   }

}
