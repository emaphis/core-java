/*
 * Chapter 6  Generic Programming
 * Sec 5 Generics in the Java Virtual Machine
 * Bridge Methods
 */
package impatient.ch06.sec05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class WordList extends ArrayList<String> {

   @Override
   public boolean add(String e) {
      return isBadWord(e) ? false : super.add(e);
   }

   @Override
   public String get(int i) {
      return super.get(i).toLowerCase();
   }

   public static boolean isBadWord(String s) {
      return List.of("sex", "drugs", "c++").contains(s.toLowerCase());
   }
}
