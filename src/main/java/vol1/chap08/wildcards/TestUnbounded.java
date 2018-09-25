/*
 * Chapter 8 Generics
 * Section Unbounded Wildcards
 */
package vol1.chap08.wildcards;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class TestUnbounded {
   // Operations that do not depend on type of Object
   public static void printList(List<?> list) {
      for (Object elem: list) {
         System.out.print(elem + " ");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      List<Integer> li = Arrays.asList(1,2,3);
      List<String> ls = Arrays.asList("one", "two", "three");
      printList(li);
      printList(ls);
   }

}
