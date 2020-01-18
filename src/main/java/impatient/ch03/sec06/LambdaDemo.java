/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 6 Processing Lambda Expressions
 * Implementing deferred Execution
 */

package impatient.ch03.sec06;

import java.util.function.IntConsumer;

/**
 *
 * @author emaphis
 */
public class LambdaDemo {

   public static void main(String[] args) {
      deferedExecutionDemo();
      intConsumerDemo();
   }

   // deferred execution
   public static void repeat(int n, Runnable action) {
      for (int i = 0; i < n; i++) action.run();
   }

   static void deferedExecutionDemo() {
      repeat(10, () -> System.out.println("Hello, world!"));
   }

   // IntConsumer
   public static void repeat(int n, IntConsumer action) {
      for (int i = 0; i < n; i++) action.accept(i);
   }

   static void intConsumerDemo() {
      repeat(10, i -> System.out.println("Countdown " + (9 - i)));
   }
}
