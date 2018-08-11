/*
 * Concrete class implementing Person
 */
package vol1.chap05.sec01;

/**
 * @author emaphis
 */
public class Student extends Person {
   private final String major;

   public Student(String name, String major) {
      super(name);
      this.major = major;
   }

   @Override
   public String getDescription() {
      return "a student majoring in " + major;
   }   
}
