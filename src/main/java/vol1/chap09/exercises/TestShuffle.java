/*
 * Chapter 9 Collections
 * Exercises 11
 */
package vol1.chap09.exercises;

import java.util.*;

/**
 *
 * @author emaphis
 */
public class TestShuffle {
   public static void main(String[] args) {
      ArrayList<String> wordList = new ArrayList<>();
      wordList.add("aaaa");
      wordList.add("bbbb");
      wordList.add("cccc");
      wordList.add("dddd");
      wordList.add("eeee");
      wordList.add("ffff");

      Collections.shuffle(wordList.subList(0, wordList.size()-1));
      System.out.println(wordList.toString());
   }
}
