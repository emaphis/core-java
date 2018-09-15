/*
 * Chapter 1 Basics
 * Section 2
 */
package vol1.chap03.arrays;

/**
 * @author emaphis
 */
public class MultiDimArrayDemo {
   public static void main(String[] args) {
      String[][] names = {
         {"Mr. ", "Mrs. ", "Ms. "},
         {"Smith", "Jones"}
      };
      // Mr. Smith
      System.out.println(names[0][0] + names[1][0]);
      // Ms. Jones
      System.out.println(names[0][2] + names[1][1]);
      // Array length
      System.out.println(names.length);
   }
}
