/*
 * Chapter 6 Classes
 * Section generics
 */
package vol1.chap08.generics;

/**
 *
 * @author emaphis
 * @param <K>
 * @param <V>
 */
public interface Pair<K, V> {
   public void setKey(K key);
   public void setValue(V value);
   public K getKey();
   public V getValue();
}
