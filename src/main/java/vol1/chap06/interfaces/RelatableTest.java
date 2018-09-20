/*
 * Chapter 6 Classes
 * Section Interfaces
 */
package vol1.chap06.interfaces;

/**
 *
 * @author emaphis
 */
public class RelatableTest {
   public Object findSmallist(Object object1, Object object2) {
      Relatable obj1 = (Relatable) object1;
      Relatable obj2 = (Relatable) object2;
      if (obj1.isLargerThan(obj2) < 0)
         return object1;
      else
         return object2;
   }

   public Object findLargest(Object object1, Object object2) {
      Relatable obj1 = (Relatable) object1;
      Relatable obj2 = (Relatable) object2;
      if (obj1.isLargerThan(obj2) > 0)
         return object1;
      else
         return object2;
   }

   public boolean isEqual(Object object1, Object object2) {
      Relatable obj1 = (Relatable) object1;
      Relatable obj2 = (Relatable) object2;
      return obj1.isLargerThan(obj2) == 0;
   }
}
