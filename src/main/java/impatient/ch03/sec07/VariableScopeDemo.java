/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 7 Lambda Expressions and Variable Scope
 * Scope of a Lambda Expression
 */
package impatient.ch03.sec07;

/**
 *
 * @author emaphis
 */
public class VariableScopeDemo {

   public static void main(String[] args) {
      repeatMessage("Hello", 10);
      System.out.println("Goodbye.");
   }

   // Accssing Variables from the Eclosing Scope
   public static void repeatMessage(String text, int count) {
      // count is global to the lambda
      Runnable r = () -> {
         for (int i = 0; i < count; i++) {
            System.out.println(text);
         }
      };

      new Thread(r).start();
   }
}
