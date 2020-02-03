/*
 * Chapter 6  Generic Programming
 * Sec 3  Type Bounds
 *
 */
package impatient.ch06.sec03;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class Closeables {
   public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
      for (T elem : elems) {
         elem.close();
      }
   }

}
