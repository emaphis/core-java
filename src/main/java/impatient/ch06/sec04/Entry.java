/*
 * Chapter 6  Generic Programming
 * Sec 5  Generics in the Java Virtual Machine
 * Type Erasure
 */
package impatient.ch06.sec04;

/**
 *
 * @author emaphis
 */
public class Entry {
   private Object key;
   private Object value;

   public Entry(Object key, Object value) {
      this.key = key;
      this.value = value;
   }

   public Object getKey() { return key; }
   public Object getValue() { return value; }
}
