/*
 * Chapter 4  Inheritance and Reflection
 * Exercises
 */
package impatient.ch04.exercises;

/*
Suppose that in Section 4.2.2, “The equals Method” (page 148), the
Item.equals method uses an instanceof test. Implement DiscountedItem.equals so
that it compares only the superclass if otherObject is an Item, but also includes
the discount if it is a DiscountedItem. Show that this method preserves
symmetry but fails to be transitive—that is, find a combination of items
and discounted items so that x.equals(y) and y.equals(z), but not x.equals(z)
*/
/**
 * @author emaphis
 */
public class Ex06 {

   public static void main(String[] args) {
      Item item1 = new Item("Beans", 2.50);
      DiscountedItem item2 = new DiscountedItem("Beans", 2.50, 0.20);
      DiscountedItem item3 = new DiscountedItem("Beans", 2.50, 0.30);

      // Symetric: x=y, y=x, x=y, x=z, z=x
      System.out.println("x=y: " + item1.equals(item2));
      System.out.println("y=x: " + item2.equals(item1));
      System.out.println("x=z: " + item1.equals(item3));
      System.out.println("z=x: " + item3.equals(item1));

      // But not symetric
      System.out.println("y=z: " + item2.equals(item3));
      System.out.println("z=y: " + item3.equals(item2));
   }

}
