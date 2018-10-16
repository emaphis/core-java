/*
 * Chapter 9 Collections
 * Section vol1.chap09.exercises
 */
package vol1.chap09.exercises;

import java.util.Iterator;

/**
 *
 * @author emaphis
 */
public class TestIntegerView {
   public static void main(String[] args) {
      IntegerView view = new IntegerView();
      Iterator<Integer> iter = IntegerView.listView(5);
      while (iter.hasNext()) {
         System.out.println("n = " + iter.next());
      }
   }
}
