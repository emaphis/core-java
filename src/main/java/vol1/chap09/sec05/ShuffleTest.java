/*
 * Chapter 9 Collections
 * Section vol1.chap09.sec05
 */
package vol1.chap09.sec05;

import java.util.*;

/**
 *
 * @author emaphis
 */
public class ShuffleTest {
   public static void main(String[] args) {
      List<Integer> numbers = new ArrayList<>();
      for (int i = 1; i <= 49; i++) {
         numbers.add(i);
      }
      Collections.shuffle(numbers);
      List<Integer> winningCombination = numbers.subList(0, 6);
      Collections.sort(winningCombination);
      System.out.println(winningCombination);
   }
}
