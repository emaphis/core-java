/*
 * Chapter 1 Basics
 * Section vol1.chap03.exercises
 */
package vol1.chap03.exercises;

/**
 * @author emaphis
 */
public class NumberHolderTest {
   public static void main(String[] args) {
      NumberHolder holder = new NumberHolder();
      holder.anInt = 1;
      holder.aFloat = 2.0f;
      System.out.println("anInt: " + holder.anInt + ", aFloat: " + holder.aFloat);
   }
}
