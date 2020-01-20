/*
 * Chapter 4 Inheritance and Reflection
 * Sec 1 Extending a Class
 * Superclass Assignments
 */
package impatient.ch04.sec01;

/**
 * Test the Manager and Employee classes
 * @author emaphis
 */
public class ManagerDemo {

   public static void main(String[] args) {
      Employee[] staff = new Employee[4];
      staff[0] = setEmployee(new Employee("Moe", 10000.0));
      staff[1] = setEmployee(new Employee("Curly", 15000.0));
      staff[2] = setEmployee(new Employee("Larry", 20000.0));
      staff[3] = setEmployee(new Manager("Big Boss", 25000.0));

      double sum = 0;
      for (Employee employee : staff) {
         sum += employee.getSalary();
      }

      System.out.println(sum);
   }

   static Employee setEmployee(Employee emp) {
      if (emp instanceof Manager) {
         ((Manager) emp).setBous(1000);
         return emp;
      } else {
         return emp;
      }
   }
}
