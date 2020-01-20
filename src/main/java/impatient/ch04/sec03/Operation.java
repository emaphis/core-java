/*
 * Chapter 4 Inheritance and Reflection
 * Sec 3 Enumerations
 * Bodies of Instaances
 */
package impatient.ch04.sec03;

/**
 * @author emaphis
 */
public enum Operation {
   ADD("+") {
      @Override
      public int eval(int arg1, int arg2) { return arg1 + arg2; }
   },
   SUBTRACT("-") {
      @Override
      public int eval(int arg1, int arg2) { return arg1 - arg2; }
   },
   MULTIPLY("*") {
      @Override
      public int eval(int arg1, int arg2) { return arg1 * arg2; }
   },
   DIVIDE("/") {
      @Override
      public int eval(int arg1, int arg2) { return arg1 / arg2; }
   };

   private final String symbol;
   private Operation(String symbol) { this.symbol = symbol; }
   public String getSymbol() { return symbol; }

   public abstract int eval(int arg1, int arg2);
}
