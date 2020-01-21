/*
 * Chapter 4  Inheritance and Reflection
 * Exercises 3
 */
package impatient.ch04.exercises;

/*
Make the instance variables x and y of the Point class in Exercise 1 protected.
Show that the LabeledPoint class can access these variables only in LabeledPoint
instances
*/

/**
 * @author emaphis
 */
public class Ex03 {

   public static void main(String[] args) {
      Point pt1 = new Point(3, 4);
      Point pt2 = new Point(5, 6);

      double x1 = pt1.x; // Protected access is legal the same package.

      double distance = LabeledPoint.distance(pt1, pt2);
      System.out.println("Distance: " + distance);
   }
}
