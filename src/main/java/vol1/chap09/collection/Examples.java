/*
 * Chapter 9 Collections
 * Section vol1.chap09.collection
 */
package vol1.chap09.collection;

import java.util.*;

/**
 *
 * @author emaphis
 */
public class Examples {
   static void examples() {
      Collection<String> cs =
            new ArrayList<>(Arrays.asList("aaa", "bbb", "ccc"));
      String[] sa = cs.toArray(new String[0]);

      System.out.println(Arrays.toString(sa));

      // empty arrays
      final String[] EMPTY = new String[0];
      String[] sa1 = cs.toArray(EMPTY);

      System.out.println(Arrays.toString(sa1));
   }

   public static void main(String[] args) {
      examples();
   }
}