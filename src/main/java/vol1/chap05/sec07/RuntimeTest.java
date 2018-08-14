/*
 * Chaper 5 Inheritence
 * Section 7 pg 261
 */
package vol1.chap05.sec07;

import java.util.Random;
import vol1.chap05.sec02.Employee;

/**
 * Runtime characteristics of a class
 * @author emaphis
 */
public class RuntimeTest {
   public static void main(String[] args) {
      Employee e = new Employee("Harry Hacker", 40000, 1987, 7, 17);
      Class cl1 = e.getClass();

      System.out.println("e class= " + cl1);
      // e class= class vol1.chap05.sec02.SEmployee
      System.out.println(cl1.getName() + " " + e.getName());
      // vol1.chap05.sec02.Employee Harry Hacker

      Random generator = new Random();
      Class cl2 = generator.getClass();
      String name = cl2.getName();
      System.out.println("class name=" + name);
      // class name=java.util.Random

      Class cl3 = Random.class;
      Class cl4 = int.class;
      Class cl5 = Double[].class;
      System.out.println("Random=" + cl3 + ", int=" + cl4 + ", Double[]=" + cl5);
      // Random=class java.util.Random, int=int, Double[]=class [Ljava.lang.Double;
   }
}
