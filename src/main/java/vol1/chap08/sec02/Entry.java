/*
 * Generics.
 */
package vol1.chap08.sec02;

/**
 * Stores Key Value pairs
 * @author emaphis
 * @param <K> Type of key
 * @param <V> Type of value
 */
public class Entry<K, V> {
   private final K key;
   private final V value;

   public Entry(K key, V value) {
      this.key = key;
      this.value = value;
   }

   public K getKey() { return key; }
   public V getValue() { return value; }
}
