/*
 *  Chapter 2 Object-Oriented Programming
 *        2.2 Implementing Classes
 */
package impatient.ch02.sec02;

import java.util.Random;

/**
 * Call by value
 * @author emaphis
 */
public class EvilManager {
   private final Random generator;

   public EvilManager() {
      this.generator = new Random();
   }

   public void giveRandomRaise(Employee e) {
      double percentage = 10 * generator.nextDouble();
      e.raiseSalary(percentage);
   }

   public void increaseRandomly(double x) {  // won't work
      double amount = x * 10 * generator.nextDouble();
      x += amount;
   }

   public void replaceWithZombie(Employee e) {
      e = new Employee("", 0);
   }
}
