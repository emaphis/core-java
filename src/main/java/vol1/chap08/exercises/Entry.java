/*
 * Generics exercises.
 * Exercise 3.
 */
package vol1.chap08.exercises;

/**
 * Stores Key Value pairs
 * @author emaphis
 * @param <K> Type of key
 * @param <V> Type of value
 */
public class Entry<K, V> {
   private K key;
   private V value;

   public Entry(K key, V value) {
      this.key = key;
      this.value = value;
   }

   public K getKey() { return key; }
   public V getValue() { return value; }

   public void setKey(K key) { this.key = key; }
   public void setValue(V value) { this.value = value; }
}
