/*
 * Chapter 8
 * Exercise 1
 */
package vol1.chap08.exercises;

import java.util.ArrayList;

/**
 * A generic stack
 * @author emaphis
 * @param <E> type of stack
 */
public class Stack<E> {
   private final ArrayList<E> stk;

   public Stack(int size) {
      stk = new ArrayList<>(size);
   }

   public void push(E item) {
      stk.add(item);
   }

   public E pop() {
      if (stk.isEmpty()) {
         throw new IllegalStateException("stack is empty");
      }
      E item = stk.remove(stk.size() - 1);
      return item;
   }

   public boolean isEmpty() {
      return stk.isEmpty();
   }
}
