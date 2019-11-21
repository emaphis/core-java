/*
 * InputDemo.java
 * 1.6 Input and Output
 */
package impatient.ch01.sec06;

import java.util.Scanner;

/**
 * Input output demo.
 * @author emaphis
 */
public class InputDemo {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("What is your name?");
      var name = in.nextLine();
      var firstName = in.next();
      System.out.println("How old are you?");
      if (in.hasNextInt()) {
          int age = in.nextInt();
          System.out.printf("Hello, %s. Next year, you'll be %d.\n", name, age + 1);
      } else {
          System.out.printf("Hello, %s. Are you too young to enter an integer?", name);
      }

      in.close();
   }
}
