/*
 * Chapter 9 Colections
 * Section vol1.chap09.sec02
 */
package vol1.chap09.sec02;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Try out LinkedList.
 * @author emaphis
 */
public class LinkedListTest {
   public static void main(String[] args) {
      List<String> a = new LinkedList<>();
      a.add("Amy");
      a.add("Carl");
      a.add("Erica");

      List<String> b = new LinkedList<>();
      b.add("Bob");
      b.add("Doug");
      b.add("Frances");
      b.add("Gloria");

      // merge the words from b into a
      ListIterator<String> aIter = a.listIterator();
      Iterator<String> bIter = b.iterator();

      while (bIter.hasNext()) {
         if (aIter.hasNext()) aIter.next();
         aIter.add(bIter.next());
      }

      System.out.println(a);

      // remove every second word from b
      bIter = b.iterator();
      while (bIter.hasNext()) {
         bIter.next();   // skip next element
         if (bIter.hasNext()) {
            bIter.next();   // skip the second element
            bIter.remove(); // remove that element
         }
      }

      System.out.println(b);

      // bulk operation: remove all words in b from a

      a.removeAll(b);

      System.out.println(a);
   }
}
