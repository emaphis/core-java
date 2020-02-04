/*
 * Chapter 6  Generic Programming
 * Sec 1  Generic classes.
 * Defining a simple generic class.
 */
package impatient.ch06.sec01;

/**
 *
 * @author emaphis
 */
public class PairTest1 {

   public static void main(String[] args) {
      String[] worlds = {"Mary", "had", "a", "little", "lamb" };
      Pair<String> mm = ArrayAlg.minmax(worlds);
      System.out.println("min = " + mm.getFirst());
      System.out.println("max = " + mm.getSecond());
   }
}
