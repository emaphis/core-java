/*
 * Chapter 2 Object-Oriented Programming
 * Section 2.6 Nested Classes
 * NetworkDemo.java
 */
package impatient.ch02.sec06;

/**
 * Inner Classes
 * @author emaphis
 */
public class NetworkDemo {
   public static void main(String[] args) {
      Network myFace = new Network();
      Network tooter = new Network();
      Network.Member fred = myFace.enroll("Fred");

      // An object, but not enfrolled
      // Make the constructor private to prevent this.
      Network.Member wilma = myFace.new Member("Wilma");
      fred.addFrient(wilma);

      Network.Member barney = tooter.enroll("Barney");
      fred.addFrient(barney);
      System.out.println("myFace: " + myFace);

      // If it shouldn't be possible to add a friend
      // from another netork, call belongsTo()
      System.out.println("barney belongs to; " + barney.belongsTo(myFace));
   }
}
