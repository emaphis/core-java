/*
 * Generics Exercises
 * Exercise 4
 */
package vol1.chap08.exercises;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 * @param <K>
 * @param <V>
 */
public class Table2<K, V> {
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

   private final ArrayList<Entry<K, V>> tbl;

   public Table2() {
      tbl = new ArrayList<>();
   }

   public V get(K key) {
      for (Entry<K, V> e : tbl) {
         if (e.getKey().equals(key))
            return e.getValue();
      }
      return null; // not found
   }

   public void set(K key, V value) {
      // search vor prexisting key
      for (Entry e : tbl) {
         if (e.getKey().equals(key)) {
            e.setValue(value);
            return; // found, return early
         }
      }
      // key not found, add.
      tbl.add(new Entry<>(key, value));
   }

   public void remove(K key) {
      for (Entry<K, V> e : tbl) {
         if (e.getKey().equals(key)) {
            tbl.remove(e);
            return; // found, return early.
         }
      }
   }
}
