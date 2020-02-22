/*
 * Chapter 1  Introduction
 * Sec 1 Generics 22 - pg 4
 *
 */
package generics.ch01;

import java.util.ArrayList;
import java.util.List;

/**
 * Cast-iron guarantee: the implicit casts added by the compilation of
 * generics never fail
 * <b>But:</b> it applies only when no unchecked warnings have been
 * issued by the compiler
 * @author emaphis
 */
public class Generics1 {
   public static void main(String[] args) {
      example1();
      example2();
   }

   // with generics.
   static void example1() {
      List<String> words = new ArrayList<>();
      words.add("Hello ");
      words.add("world!");
      String str = words.get(0) + words.get(1);
      System.out.println(str);
   }

   // without generics
   static void example2() {
      List words = new ArrayList();
      words.add("Hello ");
      words.add("world!");
      String str = ((String)words.get(0)) + ((String)words.get(1));
      System.out.println(str);
   }
}
