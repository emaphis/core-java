/*
 * Generics exercises
 * Exercise 2b
 */
package vol1.chap08.exercises;

import java.util.Arrays;

/**
 * Stack implemented as Object Array
 * @author emaphis
 * @param <E> type of stack
 */
public class OStack<E> {
   private Object[] stk;
   private int idx; 

   public OStack(int size) {
      if (size <= 0)
         throw new IllegalArgumentException("size must be 1 or greater");
      stk = new Object[size];
      idx = 0;
   }

   public void push(E item) {
      if (idx == stk.length)
         stk = Arrays.copyOf(stk, idx * 2);
      stk[idx++] = item;
   }

   public E pop() {
      if (idx == 0)
         throw new IllegalStateException("stack is empty");
      return (E) stk[--idx];
   }

   public boolean isEmpty() {
      return idx <= 0;
   }
}
