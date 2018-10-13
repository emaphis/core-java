/*
 * Chapter 9 Collections
 * Section Iterable
 */
package vol1.chap09.iterable;

import java.util.Iterator;

/**
 * Counter class implements Iterable interface
 * @author emaphis
 */
class Counter implements Iterable<Integer> {
   private final int count;
   public Counter(int count) { this.count = count; }

   @Override
   public Iterator<Integer> iterator() {
      return new Iterator<Integer>() {
         private int i = 0;
         @Override
         public boolean hasNext() { return i < count; }
         @Override
         public Integer next() { i++; return i; }
         @Override
         public void remove() { throw new UnsupportedOperationException(); }
      };
   }
}
