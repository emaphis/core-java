/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 2 Static, Default, and Private Methods
 * Resolving Default Method Conflics
 * Person.java
 */

package impatient.ch03.sec02;

/**
 *
 * @author emaphis
 */
public interface Person {
   String getName();
   default int getId() { return 0; }
}
