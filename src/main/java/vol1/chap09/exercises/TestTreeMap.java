/*
 * Chapter 9 Collections
 * Exercise 7
 */
package vol1.chap09.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author emaphis
 */
public class TestTreeMap {
   public static TreeMap<String, Integer> countWords(File file) {
      TreeMap<String, Integer> map = new TreeMap<>();
      try {
         Scanner scanner = new Scanner(file);
         while (scanner.hasNext()) {
            String word = scanner.next();
            map.merge(word, 1, (m,n) -> Integer.sum(m, n));
         }
      } catch(FileNotFoundException ex) {
         System.err.println("exception: " + ex);
      }

      return map;
   }
   public static void main(String[] args) {
      //System.out.println(System.getProperty("user.dir"));
      File file = new File(".\\src\\main\\resources\\LoremIpsum.txt");
      System.out.println(file.exists());
      TreeMap<String, Integer> wordMap = countWords(file);

      wordMap.forEach((word, count) -> System.out.println(word + " = " + count));
   }
}
