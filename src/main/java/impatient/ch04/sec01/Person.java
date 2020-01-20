/*
 * Chapter 4 Inheritance and Reflection
 * Sec 1 Extending a Class
 * Abstract Methods and Classes
 */
package impatient.ch04.sec01;

/**
 *
 * @author emaphis
 */
public abstract class Person {
   private String name;

   public Person(String name) { this.name = name; }
   public final String getName() { return name; }

   public abstract int getId();
}
