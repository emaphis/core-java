/*
 * Chapter 9 Colections
 * Section vol1.chap09.sec02
 */
package vol1.chap09.sec02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Testing the Set class
 * Set is used to print all unique words in System.in
 * @author emaphis
 */
public class TestSet {
   public static void main(String[] args) {
      Set<String> words = new HashSet<>();
      long totalTime = 0;

      try (Scanner in = new Scanner(System.in)) {
         while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
         }
      }

      Iterator<String> iter = words.iterator();
      for (int i = 1; i < 20 && iter.hasNext(); i++) {
         System.out.println(iter.next());
      }
      System.out.println(". . .");
      System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");
   }
}
