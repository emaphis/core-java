/*
 * Chapter 9 Collections
 * Exercise 8
 */
package vol1.chap09.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author emaphis
 */
public class TestHashmap {

   public static TreeMap<String, Set<Integer>> countLines(File file) {
      TreeMap<String, Set<Integer>> map = new TreeMap<>();
      try {
         Scanner scanner = new Scanner(file);
         int pageNo = 1;
         while (scanner.hasNextLine()) {
            String[] wordArray = scanner.nextLine().split(" ");
            for (String word : wordArray) {
               word = word.toLowerCase();
               if (map.containsKey(word))
                  map.get(word).add(pageNo);
               else {
                  Set<Integer> wordLines = new HashSet<>();
                  wordLines.add(pageNo);
                  map.put(word, wordLines);
               }

            }
            pageNo++;
         }
      } catch(FileNotFoundException ex) {
         System.err.println("exception: " + ex);
      }

      return map;
   }
   public static void main(String[] args) {
      //System.out.println(System.getProperty("user.dir"));
      File file = new File(".\\src\\main\\resources\\words.txt");
      System.out.println(file.exists());
      Map<String, Set<Integer>> wordMap = countLines(file);

      wordMap.forEach((word, set) ->
            System.out.println(word + " = " + set.toString()));
   }
}
