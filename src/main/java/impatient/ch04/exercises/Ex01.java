/*
 * Chapter 4  Inheritance and Reflection
 * Exercise 1
 */
package impatient.ch04.exercises;

/*
Define a class Point with a constructor public Point(double x, double y) and
accessor methods getX, getY. Define a subclass LabeledPoint with a constructor
public LabeledPoint(String label, double x, double y) and an accessor method
getLabel
*/


/**
 *
 * @author emaphis
 */
public class Ex01 {

   public static void main(String[] args) {
      // Exercise 1
      Point pt1 = new Point(1, 2);
      System.out.println("Point x: " + pt1.getX() + " y: " + pt1.getY());

      LabeledPoint pt2 = new LabeledPoint("Pt2", 4, 5);
      System.out.println("Point Label: " + pt2.getLabel() + " x: " + pt2.getX() + " y: " + pt2.getY());
 }

}
