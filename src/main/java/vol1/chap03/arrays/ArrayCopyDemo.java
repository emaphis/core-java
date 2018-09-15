/*
 * Chapter 1 Basics
 * Section 3 arrays
 */
package vol1.chap03.arrays;

import java.util.Arrays;

/**
 * Copying Arrays
 * @author emaphis
 */
public class ArrayCopyDemo {
   public static void main(String[] args) {
      char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                         'i', 'n', 'a', 't', 'e', 'd' };
      char[] copyTo = new char[7];
      System.arraycopy(copyFrom, 2, copyTo, 0, 7);
      System.out.println("copyTo: " + new String(copyTo));

      // copyOfRange
      char[] copyTo2 = Arrays.copyOfRange(copyFrom, 2, 9);
      System.out.println("copyTo2: " + new String(copyTo2));
   }
}
