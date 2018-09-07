/*
 * Chapter 8 Generics
 * Exercises 7,8
 */
package vol1.chap08.exercises;

/**
 * Test the Pair(E) class.
 * @author emaphis
 */
public class PairTest {
   public static void main(String[] args) {
      Pair<String> pair = new Pair("BB","AAA");
      // exercise 7 test
      System.out.println("first=" + pair.getFirst() + ",second=" + pair.getSecond());
      // exercise 8 test
      System.out.println("max=" + pair.getMax() + ",min=" + pair.getMin());
   }
}
