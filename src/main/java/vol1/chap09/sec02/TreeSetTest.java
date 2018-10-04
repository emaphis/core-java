/*
 * Chapter 9 Collections
 * Section 2.4
 */
package vol1.chap09.sec02;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Class sorts a set of item by comparing their descriptions.
 * @author emaphis
 */
public class TreeSetTest {
   public static void main(String[] args) {
      SortedSet<Item> parts = new TreeSet<>();
      parts.add(new Item("Toster", 1234));
      parts.add(new Item("Widget", 4562));
      parts.add(new Item("Modem", 9912));
      System.out.println(parts);
      System.out.println(parts.getClass());

      NavigableSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription));
      sortByDescription.addAll(parts);
      System.out.println(sortByDescription);
   }
}
