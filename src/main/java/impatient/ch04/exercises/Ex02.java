/*
 * Chapter 4  Inheritance and Reflection
 * Exercise 2
 */
package impatient.ch04.exercises;

/*
Define toString, equals, and hashCode methods for the classes of the preceding
exercise.
*/

/**
 * @author emaphis
 */
public class Ex02 {

   public static void main(String[] args) {

      // Exercise toString
      Point pt1 = new Point(1, 2);
      System.out.println(pt1);

      LabeledPoint pt2 = new LabeledPoint("Pt2", 4, 5);
      System.out.println(pt2);

      Point pt3 = new Point(1, 2);
      Point pt4 = new Point(1, 3);

      System.out.println("Pt1 == Pt2 " + pt1.equals(pt2));
      System.out.println("Pt1 == Pt3: " + pt1.equals(pt3));
      System.out.println("Pt1 == Pt4: " + pt1.equals(pt4));

      System.out.println("Hash Pt1 " + pt1.hashCode());
      System.out.println("Hash Pt2 " + pt2.hashCode());
      System.out.println("Hash Pt3 " + pt3.hashCode());
      System.out.println("Hash Pt4 " + pt4.hashCode());
   }

}
