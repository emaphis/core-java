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
public class Student extends Person implements Named {
   private int id;

   public Student(String name, int id) {
      super(name);
      this.id = id;
   }

   @Override
   public int getId() { return id; }
}
