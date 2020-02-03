/*
 * Chapter 6  Generic Programming
 * Sec 1  Generic Classes
 *
 */
package impatient.ch06.sec01;

/**
 *
 * @author emaphis
 * @param <K>
 * @param <V>
 */
public class Entry<K, V> {
   private final K key;
   private final V value;

   public Entry(K key, V value) {
      this.key = key;
      this.value = value;
   }

   public K getKey() {
      return key;
   }

   public V getValue() {
      return value;
   }

}
