/*
 * Chapter 5 Section 7
 * Reflection - ObjectAnalyzer.
 */
package vol1.chap05.sec07;

import java.util.ArrayList;

/**
 * Test the ObjectAnalyzer
 * Use reflection to spy on objects at run time.
 * @author emaphis
 */
public class ObjectAnalyzerTest {
   public static void main(String[] args) {
      ArrayList<Integer> squares = new ArrayList<>();
      for (int i = 1; i <= 5; i++)
         squares.add(i * i);
      System.out.println(new ObjectAnalyzer().toString(squares));
   }
}
