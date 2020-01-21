/*
 * Chapter 4  Inheritance and Reflection
 * Exercise 5
 */
package impatient.ch04.exercises;

/*
Define clone methods for the classes of the preceding exercise.
*/

/**
 * @author emaphis
 */
public class Ex05 {

   public static void main(String[] args) throws CloneNotSupportedException {
      Point pt1 = new Point(5, 1);
      Point pt2 = pt1.clone();
      System.out.println(pt1.equals(pt2));
      LabeledPoint pt3 = new LabeledPoint("Pt3", 5, 6);
      LabeledPoint pt4 = pt3.clone();
      System.out.println(pt3.equals(pt4));
      Circle c1 = new Circle(pt1, 4);
      Circle c2 = c1.clone();
      System.out.println("Circle=" + c1.equals(c2));
      Rectangle r1 = new Rectangle(pt1, 4, 5);
      Rectangle r2 = r1.clone();
      System.out.println(r1);
      System.out.println(r2);
      System.out.println("Rectangle=" + r2.equals(r1));
      Line l1 = new Line(pt1, new Point(5, 9));
      Line l2 = l1.clone();
      System.out.println(l1);
      System.out.println(l2);
      System.out.println("Line=" + l1.equals(l2));
   }

}
