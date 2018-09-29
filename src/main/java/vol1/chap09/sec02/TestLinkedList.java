/*
 * Chapter 9 Collections
 * Section vol1.chap09.sec02
 */
package vol1.chap09.sec02;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class TestLinkedList {

   public static void testLinkedList1() {
      List<String> staff = new LinkedList<>(); // LinkedList implements List
      staff.add("Amy");
      staff.add("Bob");
      staff.add("Carl");
      Iterator<String> iter = staff.iterator();
      String first = iter.next();  // visit first element
      String second = iter.next(); // visit second element
      iter.remove(); // remove last item.
      System.out.println("first: " + first + ", second: " + second);
      System.out.println("List: " + staff.toString());
   }
   public static void main(String[] args) {
      testLinkedList1();
   }
}
