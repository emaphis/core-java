/*
 * Chapter 9 Collections
 * Exercise 2
 */
package vol1.chap09.exercises;

import java.util.*;

/**
 * Capitalize a list of Strings
 * @author emaphis
 */
public class TestListOfStrings {
   static ArrayList<String> capitalize1(ArrayList<String> ls) {
      Iterator<String> it = ls.iterator();
      ArrayList<String> al = new ArrayList<>(ls.size());
      while (it.hasNext()) {
         al.add(it.next().toUpperCase());
      }
      return al;
   }

   static ArrayList<String> capitalize2(ArrayList<String> ls) {
      ArrayList<String> al = new ArrayList<>(ls.size());
      for (int i = 0; i < ls.size(); i++)
         al.add(ls.get(i).toUpperCase());
      return al;
   }

   static ArrayList<String> capitalize3(ArrayList<String> ls) {
      ArrayList<String> al = new ArrayList<>(ls);
      al.replaceAll((string) -> string.toUpperCase());
      return al;
   }

   public static void main(String[] args) {
      final ArrayList<String> al = new ArrayList<>(Arrays.asList("aaa", "bbb", "ccc", "ddd"));
      System.out.println(capitalize1(al));
      System.out.println(capitalize2(al));
      System.out.println(capitalize3(al));
   }
}
