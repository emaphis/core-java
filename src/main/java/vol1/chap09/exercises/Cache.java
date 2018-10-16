/*
 * Chapter 9 Collections
 * Exercise 13
 */
package vol1.chap09.exercises;

import java.util.*;

/**
 * A Cache that throws away it's oldest value
 * @author emaphis
 * @param <K>  type of Key
 * @param <V>  type of Value
 */
public class Cache<K,V> extends LinkedHashMap<K,V> {
   private final int capacity;

   public Cache(int capacity) {
      super(capacity);
      this.capacity = capacity;
   }

   @Override
   protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
      return this.size() > this.capacity;
   }
}
