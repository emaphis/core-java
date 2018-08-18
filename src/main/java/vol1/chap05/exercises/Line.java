/*
 * Chapter 4 exercises
 * Abstract class;
 */
package vol1.chap05.exercises;

/**
 *
 * @author emaphis
 */
class Line extends Shape {
   private final Point to;

   public Line(Point from, Point to) {
      super(from);
      this.to = to;
   }

   @Override
   public Point getCenter() {
      return new Point((getPoint().getX() + to.getX()) / 2.0,
                       (getPoint().getY() + to.getY()) / 2.0);
   }


}
