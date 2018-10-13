/*
 * Chapter 9 Collections
 * Section Collection Interface
 */
package vol1.chap09.collection;

import java.util.*;

/**
 *
 * @author emaphis
 */
public class MergeCollections {

   static <T extends Comparable<? super T>>
       List<T> merge(Collection <? extends T> c1, Collection<? extends T> c2) {
      List<T> mergedList = new ArrayList<>();
      Iterator<? extends T> iter1 = c1.iterator();
      Iterator<? extends T> iter2 = c2.iterator();
      T c1Element = getNextElement(iter1);
      T c2Element = getNextElement(iter2);
      // each iteration will take a task fro one of the iterators;
      // continue until neither iterator has any further tasks
      while (c1Element != null || c2Element != null) {
         // use the current c1 element if either the current c2
         // element is null, or bothe are non-null and the c1 element
         // precede the c2 element in  the natural order
         boolean useC1Element = c2Element == null ||
                 c1Element != null && c1Element.compareTo(c2Element) < 0;
         if (useC1Element) {
            mergedList.add(c1Element);
            c1Element = getNextElement(iter1);
         } else {
            mergedList.add(c2Element);
            c2Element = getNextElement(iter2);
         }
      }
      return mergedList;
   }

   private static <E> E getNextElement(Iterator<E> itr) {
      if (itr.hasNext()) {
         E nextElement = itr.next();
         if (nextElement == null) throw new NullPointerException();
         return nextElement;
      } else {
         return null;
      }
   }
}
