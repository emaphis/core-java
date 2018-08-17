/*
 * Chapter 5 Section 6 Enums
 * Bodies of instances
 */
package vol1.chap05.sec06;

/**
 *
 * @author emaphis
 */
public class OperatorTest {
   // switiching on an Emumeration
   public static int eval(Operation op, int arg1, int arg2) {
      int result = 0;
      switch (op) {
         case ADD: result = arg1 + arg2; break;
         case SUBTRACT: result = arg1 - arg2; break;
         case MULTIPLY: result = arg1 * arg2; break;
         case DIVIDE: result = arg1 / arg2; break;
      }
      return result;
   }
}
