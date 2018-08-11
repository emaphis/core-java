/*
 * Abstact base class for Employee hirarchy.
 */
package vol1.chap05.sec01;

/*
 * @author emaphis
 */
public abstract class Person {
   public abstract String getDescription();
   private final String name;

   public Person(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }
}
