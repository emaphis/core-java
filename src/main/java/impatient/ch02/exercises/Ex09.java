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
   private double miles;
   private final double milesPerGallon;
   private double gallons;

   public Car(double milesPerGallon) {
      this.milesPerGallon = milesPerGallon;
   }

   public void drive(double distance) {
      gallons =- distance / milesPerGallon;
      miles =+ distance;
   }

   public void add(double amount) {
      gallons += amount;
   }

   public double getGallons() {
      return gallons;
   }

   public double getMiles() {
      return miles;
   }

}


public class Ex09 {

   public static void main(String[] args) {

   }

}
