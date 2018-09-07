/*
 * Chapter 8 Generics
 * Exercise 7,8
 */
package vol1.chap08.exercises;

/**
 * Represents a Pair of type E
 * Exercise 7
 * @author emaphis
 * @param <E> type of Pair
 */
public class Pair<E extends Comparable<E>> {
   private E first;
   private E second;

   public Pair(E first, E second) { this.first = first; this.second = second; }

   public E getFirst() { return first; }
   public E getSecond() { return second; }

   public void setFirst(E first) { this.first = first; }
   public void setSecond(E second) { this.second = second; }

   // Exercise 8
   public E getMax() {
      return first.compareTo(second) < 0 ? second : first;
   }
   
   public E getMin() {
      return first.compareTo(second) < 0 ? first : second;
   }
}
