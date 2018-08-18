/*
 * Chapter 5 exercises
 * Abstract class
 */
package vol1.chap05.exercises;

/**
 * Shape abstract class
 * @author emaphis
 */
public abstract class Shape {
   Point point;

   public Shape(Point point) {
      this.point = point;
   }

   public Point getPoint() {
      return point;
   }

   public void moveBy(double dx, double dy) {
      this.point = new Point(this.point.getX() + dx, this.point.getY() + dy);
   }

   public abstract Point getCenter();
}
