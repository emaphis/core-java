/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 2 Static, Default, and Private Methods
 * Resolving Default Method Conflics
 * Identified.java
 */
package impatient.ch03.sec02;

/**
 *
 * @author emaphis
 */
public interface Identified {
   default int getId() { return Math.abs(hashCode()); }
}
