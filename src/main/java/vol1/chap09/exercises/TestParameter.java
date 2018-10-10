/*
 * Chapter 9 Collections
 * Exercise 6
 */
package vol1.chap09.exercises;

import java.util.*;

/**
 *
 * @author emaphis
 */
public class TestParameter {
   public static <S extends Set<Integer>> void method1(Map<String, S> map) { }

   public static void main(String[] args) {
      HashMap<String, HashSet<Integer>> map = new HashMap<>();
      method1(map);
   }
}
