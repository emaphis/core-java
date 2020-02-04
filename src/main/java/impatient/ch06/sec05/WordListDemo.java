/*
 * Chapter 6  Generic Programming
 * Sec 5 Generics in the Java Virtual Machine
 * Bridge Methods
 */
package impatient.ch06.sec05;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class WordListDemo {

   public static void main(String[] args) {
      WordList words = new WordList();
      ArrayList<String> strings = words; //Ok - conversion to superclass.
      strings.add("Hello");
      strings.add("C++");
      strings.add("World");
      System.out.println(words);
   }
}
