/*
 * Chapter 9 Collections
 * Section vol1.chap09.sec02
 */
package vol1.chap09.sec02;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author emaphis
 */
public class TestTreeSet {
   public static void main(String[] args) {
      SortedSet<String> sorter = new TreeSet<>();
      sorter.add("Bob");
      sorter.add("Amy");
      sorter.add("Carl");
      for (String s : sorter)
         System.out.println(s);

   }
}
