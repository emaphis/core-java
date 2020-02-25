/*
 * Chapter 1  Introduction
 * Sec 4 Generic Methods and Varargs
 * pg 8-11
 */
package generics.ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class ListsDemo {

   public static void main(String[] args) {

      List<Integer> bigs = Arrays.asList(100, 200, 300);
      assert Lists.sumInteger(bigs) == Lists.sum(bigs);
      
      List<Integer> ints = Lists.toList1(new Integer[] {1, 2, 3});
      List<String> words = Lists.toList1(new String[] {"hello", "world"});
      System.out.println(ints);
      System.out.println(words);

      List<Integer> ints2 = Lists.toList2(1, 2, 3);
      List<String> words2 = Lists.toList2("hello", "world");
      System.out.println(ints2);
      System.out.println(words2);

      List<Integer> ints3 = new ArrayList<>();
      Lists.addAll(ints3, 1, 2);
      Lists.addAll(ints3, new Integer[] {3, 4, 5});
      System.out.println(ints3);

      // Type parameters are needed here:  (or not, lol)
      List<Integer> ints4 = Lists.<Integer>toList2();
      List<Object> objs1 = Lists.<Object>toList2(1, "two");
   }
}
