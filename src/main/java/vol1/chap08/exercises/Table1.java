/*
 * Generics Exercises
 * Exercise 3
 */
package vol1.chap08.exercises;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 * @param <K>
 * @param <V>
 */
public class Table1<K, V> {
   private final ArrayList<Entry<K, V>> tbl;

   public Table1() {
      tbl = new ArrayList<>();
   }

   public V get(K key) {
      for (Entry<K, V> e : tbl) {
         if (e.getKey().equals(key))
            return  e.getValue();
      }
      return null; // not found
   }

   public void set(K key, V value) {
      // search for prexisting key
      for (Entry<K, V> e : tbl) {
         if (e.getKey().equals(key)) {
            e.setValue(value);
            return; // escape early
         }
      }
      // not in table - add.
      tbl.add(new Entry<>(key, value));
   }

   public void remove(K key) {
      for (Entry<K, V> e : tbl) {
         if (e.getKey().equals(key)) {
            tbl.remove(e);
            return; // quit early.
         }
      }
   }
}
