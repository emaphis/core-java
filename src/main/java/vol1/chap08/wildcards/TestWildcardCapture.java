/*
 * Chapter 8 Generics
 * Section Wildcard Capture
 */
package vol1.chap08.wildcards;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class TestWildcardCapture {
   // capture error
   void foo(List<?> lst) {
      // lst.set(0, lst.get(0));
      fooHelper(lst);
   }

   // Helper method created so that wildcard can be captured
   // through type inference
   private <T> void fooHelper(List<T> lst) {
      lst.set(0, lst.get(0));
   }

   public static void main(String[] args) {
      List<Integer> li = Arrays.asList(1,2,3);
      new TestWildcardCapture().foo(li);
   }
}
