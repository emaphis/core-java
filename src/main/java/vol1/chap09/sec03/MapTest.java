/*
 * Chapter 9 Colections
 * Section vol1.chap09.sec03
 */
package vol1.chap09.sec03;

import java.util.HashMap;
import java.util.Map;

/**
 * Test Java Maps
 * @author emaphis
 */
public class MapTest {
   static void testMap() {
      Map<String, Employee> staff = new HashMap<>();
      staff.put("144-25-5464", new Employee("Amy Lee"));
      staff.put("567-24-2546", new Employee("Harry Hacker"));
      staff.put("157-62-7935", new Employee("Cary Cooper"));
      staff.put("456-62-5527", new Employee("Francesca Cruz"));

      // print all entries
      System.out.println(staff);

      // remove an entry
      staff.remove("567-24-2546");

      // replace and entry
      staff.put("456-62-5527", new Employee("Francesca Miller"));

      // look up a value
      System.out.println(staff.get("157-62-7935"));

      // iterate throw all entries
      staff.forEach((k, v)
            -> System.out.println("key=" + k + ", value=" + v));
   }

   public static void main(String[] args) {
      testMap();
   }
}
