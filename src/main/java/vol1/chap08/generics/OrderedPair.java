/*
 * Chapter 6 Classes
 * Section vol1.chap08.generics
 */
package vol1.chap08.generics;

/**
 *
 * @author emaphis
 * @param <K>
 * @param <V>
 */
public class OrderedPair<K, V> implements Pair<K, V> {
   private K key;
   private V value;

   public OrderedPair(K key, V value) {
      this.key = key;
      this.value = value;
   }

   @Override
   public K getKey() {
      return key;
   }

   @Override
   public V getValue() {
      return value;
   }

}
