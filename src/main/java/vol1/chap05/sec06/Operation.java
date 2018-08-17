/*
 * Chapter 5 Section 6 Enums
 * Bodies of instances
 */
package vol1.chap05.sec06;

/**
 * Enum of operations
 * @author emaphis
 */
public enum Operation {
   ADD {
      @Override
      public int eval(int arg1, int arg2) { return arg1 + arg2; }
   },
   SUBTRACT {
      @Override
      public int eval(int arg1, int arg2) { return arg1 - arg2; }
   },
   MULTIPLY {
      @Override
      public int eval(int arg1, int arg2) { return arg1 * arg2; }
   },
   DIVIDE {
      @Override
      public int eval(int arg1, int arg2) { return arg1 / arg2; }
   };

   public abstract int eval(int arg1, int arg2);
}
