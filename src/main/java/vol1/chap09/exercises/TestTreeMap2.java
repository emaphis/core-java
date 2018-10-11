/*
 * Chapter 9 Collections
 * Exercise 9
 */
package vol1.chap09.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author emaphis
 */
public class TestTreeMap2 {

   public static Map<String, Integer> testMerge(List<String> words) {
      Map<String, Integer> map = new TreeMap<>();

      for (String word : words) {
         map.merge(word, 1, Integer::sum);
      }
      return map;
   }

   public static Map<String, Integer> testContains(List<String> words) {
      Map<String, Integer> map = new TreeMap<>();

      for (String word : words) {
         if (map.containsKey(word)) {
            int sum = map.get(word);
            sum++;
            map.put(word, sum);
         } else {
            map.put(word, 1);
         }
      }
      return map;
   }

   public static Map<String, Integer> testGetAndNull(List<String> words) {
      Map<String, Integer> map = new TreeMap<>();

      for (String word : words) {
         Integer sum = map.get(word);
         if (sum != null) {
            sum++;
            map.put(word, sum);
         } else {
            map.put(word, 1);
         }
      }
      return map;
   }

   public static Map<String, Integer> testGetOrDefault(List<String> words) {
      Map<String, Integer> map = new TreeMap<>();

      for (String word : words) {
         Integer sum = map.getOrDefault(word, 0);
         sum++;
         map.put(word, sum);
      }
      return map;
   }

   public static Map<String, Integer> testPutIfAbsent(List<String> words) {
      Map<String, Integer> map = new TreeMap<>();

      for (String word : words) {
         map.putIfAbsent(word, 0);
         Integer sum = map.get(word);
         sum++;
         map.put(word, sum);
      }
      return map;
   }

   public static void printWordMap(String label, Map<String, Integer> wordMap) {
      System.out.println(label + ":");
      wordMap.forEach((word, count) ->
            System.out.println(word + " = " + count));
   }

   public static void main(String[] args) {
      File file = new File(".\\src\\main\\resources\\words.txt");
      List<String> words = new ArrayList<>();

      try {
         Scanner scanner = new Scanner(file);
         while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();
            words.add(word);
         }
      } catch(FileNotFoundException ex) {
         System.err.println("exception: " + ex);
      }

      Map<String, Integer> wordMap = testMerge(words);
      printWordMap("merge", wordMap);
      wordMap = testContains(words);
      printWordMap("contains", wordMap);
      wordMap = testGetAndNull(words);
      printWordMap("get and null", wordMap);
      wordMap = testGetOrDefault(words);
      printWordMap("get or default", wordMap);
      wordMap = testPutIfAbsent(words);
      printWordMap("put if absent", wordMap);
   }
}
