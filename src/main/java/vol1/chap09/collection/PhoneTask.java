/*
 * Chapter 9 Collections
 * Section vol1.chap09.collection
 */
package vol1.chap09.collection;

/**
 *
 * @author emaphis
 */
public final class PhoneTask extends Task {
   private final String name;
   private final String number;

   public PhoneTask(String name, String number) {
      this.name = name;
      this.number = number;
   }

   public String getName() {
      return name;
   }

   public String getNumber() {
      return number;
   }

   @Override
   public String toString() {
      return "phone " + name;
   }
}
