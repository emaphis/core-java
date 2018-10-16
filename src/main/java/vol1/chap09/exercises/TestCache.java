/*
 * Chapter 9 Collections
 * Exercise 13
 */
package vol1.chap09.exercises;

/**
 * Test the Cache class
 * @author emaphis
 */
public class TestCache {
   public static void main(String[] args) {
      Cache<Integer,String> cache = new Cache<>(4);

      cache.put(1, "AAA");
      cache.put(2, "BBB");
      cache.put(3, "CCC");
      cache.put(4, "DDD");
      System.out.println(cache.toString());
      cache.put(5, "EEE");
      System.out.println(cache.toString());
      cache.put(6, "FFF");
      cache.put(7, "GGG");
      System.out.println(cache.toString());
   }
}
