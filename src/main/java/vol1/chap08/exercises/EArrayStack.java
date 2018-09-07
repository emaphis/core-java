/*
 * Generics
 * Exercise 2a
 */
package vol1.chap08.exercises;

import java.util.Arrays;

/**
 * Stack implemented using generic array.
 * @author emaphis
 * @param <E> type of implementing array
 */
public class EArrayStack<E> {
   private E[] stk;
   private int idx;

   public EArrayStack(int size) {
      if (size <= 0)
         throw new IllegalArgumentException("size must be 1 or greater");
      stk = (E[]) new Object[size];
      idx = 0;
   }

   public void push (E item) {
      if (idx == stk.length)
         stk = Arrays.copyOf(stk, idx * 2);
      stk[idx++] = item;
   }

   public E pop() {
      if (idx <= 0) throw new IllegalStateException("stack is empty");
      E item = stk[--idx];
      return item;
   }

   public boolean isEmpy() {
      return idx <= 0;
   }
}
