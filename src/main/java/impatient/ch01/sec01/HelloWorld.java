
package impatient.ch01.sec01;

import java.util.Random;

/**
 * A first Java program
 * @author emaphis
 */
public class HelloWorld {
   public static void main(String[] args) {
      String ver = System.getProperty("java.version");
      System.out.println(ver);
      System.out.println("Hello, world!".length());

      // A new class
      Random generator = new Random();
      System.out.println(generator.nextInt());
      System.out.println(generator.nextInt());
   }
}
