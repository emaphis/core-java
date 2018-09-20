/*
 * Chapter 6 Classes
 * Section generics
 */
package vol1.chap08.generics;

/**
 * Test box and pair
 * @author emaphis
 */
public class PairTest {
   public static void testBox() {
      Box<Integer> integerBox1 = new Box<Integer>();
      Box<Integer> integerBox2 = new Box<>();
   }

   public static void testOrderedPair() {
      OrderedPair<String, Integer> p1 = new OrderedPair<>("even", 2);
      OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");
      OrderedPair<String, Box<Integer>> p3 = new OrderedPair<>("primes", new Box<>());
   }

   public static void testRawType() {
      Box<Integer> intBox = new Box<>();
      Box rawBox = new Box();

      Box<String> stringBox = new Box<>();
      stringBox.set("hello");
      rawBox = stringBox;
      rawBox.set(8);
      System.out.println(rawBox.get());
      //intBox = rawBox;
   }

   public static void main(String[] args) {
      testRawType();
   }
}
