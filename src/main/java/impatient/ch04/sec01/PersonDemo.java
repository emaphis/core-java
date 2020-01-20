/*
 * Chapter 4 Inheritance and Reflection
 * Sec 1 Extending a Class
 * Abstract Methods and Classes
 */
package impatient.ch04.sec01;

/**
 * Test Person and Student classes
 * @author emaphis
 */
public class PersonDemo {

   public static void main(String[] args) {
      Person p;
      // p = new Person("Badd Call"); // can't creat an abstract class.
      p = new Student("Fred", 1728);
      System.out.println(p.getName());
      Student s = (Student)p;
      System.out.println(s.getName());
   }

}
