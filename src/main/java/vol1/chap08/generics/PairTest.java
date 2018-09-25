/*
 * Chapter 8 Generics
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

   public static void testCompare() {
      Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
      Pair<Integer, String> p2 = new OrderedPair<>(2, "pear");
      Pair<Integer, String> p3 = new OrderedPair<>(1, "apple");
      boolean different = Util.compare(p1, p2);
      boolean same = Util.compare(p1, p3);
      System.out.println(different + " and " + same);
   }

   // bounded type parameters
   public static void testInspect() {
      Box<Integer> intBox = new Box<>();
      //intBox.set(new Integer(10));
      //intBox.inspect("some text");
   }

   public static void main(String[] args) {
      testRawType();
      testCompare();
      //testInspect();
   }
}
