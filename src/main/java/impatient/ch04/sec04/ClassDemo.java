/*
 * Chapter 4 Inheritance and Reflection
 * Sec 4 Runtime Type Information and Resource
 * The Class Class
 */
package impatient.ch04.sec04;

/**
 * @author emaphis
 */
public class ClassDemo {

   public static void main(String[] args) throws ClassNotFoundException {
      classExample();
   }

   // The Class Class
   static void classExample() throws ClassNotFoundException {
      Object obj = System.out;
      Class<?> cl0 = obj.getClass();
      System.out.println("class: " + cl0.getName());

      String className = "java.util.Scanner";
      Class<?> cl1 = Class.forName(className);
      cl1 = java.util.Scanner.class;
      System.out.println(cl1.getName());

      Class<?> cl2 = String[].class;  // Describes the array type string[]
      System.out.println(cl2.getName());
      System.out.println(cl2.getCanonicalName());
      Class<?> cl3 = Runnable.class;  // Describes the Runnable intergace
      System.out.println(cl3.getName());
      Class<?> cl4 = int.class;       // Describes the int type
      System.out.println(cl4.getName());
      Class<?> cl5 = void.class;      // Describes the void type
      System.out.println(cl5.getName());
      Class<?> cl6 = Class.class;     // the class class
      System.out.println(cl6.getName());
      Class<?> cl7 = Object.class;
      System.out.println(cl7.getName());
   }
}
