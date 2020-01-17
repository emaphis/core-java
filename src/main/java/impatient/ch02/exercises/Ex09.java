/*
 * Exercises Chapter 2
 * Ex07.java
 */
package impatient.ch02.exercises;


/*
Exercise 9
Implement a class Car that models a car traveling along the x-axis, consuming
gas as it moves. Provide methods to drive by a given number of
miles, to add a given number of gallons to the gas tank, and to get the
current distance from the origin and fuel level. Specify the fuel efficiency
(in miles/gallons) in the constructor. Should this be an immutable class?
Why or why not?
 */

/**
 *
 * @author emaphis
 */
class Car {
   private double milesTraveled;
   private final double milesPerGallon;
   private double gallons;

   public Car(double milesPerGallon) {
      this.milesPerGallon = milesPerGallon;
      this.milesTraveled = 0;
      this.gallons = 0;
   }

   public void drive(double distance) {
      double gallonsUsed = distance / milesPerGallon;
      gallons -= gallonsUsed;
      milesTraveled += distance;
   }

   public void refuel(double amount) {
      gallons += amount;
   }

   public double getFuelLevel() {
      return gallons;
   }

   public double getDistanceTraveled() {
      return milesTraveled;
   }

}


public class Ex09 {

   public static void main(String[] args) {
      var car = new Car(27.0);
      car.refuel(15.0);
      car.drive(150.0);
      System.out.println("Fuel left: " + car.getFuelLevel());
      System.out.println("Get distance traveled " + car.getDistanceTraveled());
   }

}
