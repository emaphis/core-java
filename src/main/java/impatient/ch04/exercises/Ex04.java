/*
 * Chapter 4  Inheritance and Reflection
 * Exercises 4
 */
package impatient.ch04.exercises;

import java.util.List;

/*
Define an abstract class Shape with an instance variable of class Point, a
constructor, a concrete method public void moveBy(double dx, double dy) that
moves the point by the given amount, and an abstract method public Point
getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
double height), and public Line(Point from, Point to).
*/

/**
 * @author emaphis
 */
public class Ex04 {

   public static void main(String[] args) {
      Circle c1 = new Circle(new Point(1, 3), 4);
      System.out.println("Circle center:" + c1.getCenter());

      Rectangle r1 = new Rectangle(new Point(0, 0), 4, 4);
      System.out.println("Rectangle center:" + r1.getCenter());

      Line l1 = new Line(new Point(0, 0), new Point(4, 4));
      System.out.println("Line center: " + l1.getCenter());

      // Polymorphism.
      List<Shape> list = List.of(c1, r1, l1);
      for (Shape shape : list) {
         System.out.println(shape);
      }
   }

}
